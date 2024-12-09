import java.io.*;
import java.util.*;

/**
 * Ride class simulates the operation of an amusement ride.
 * It manages the ride's name, the operator, the visitor queue, the ride history,
 * and handles operations such as adding visitors, running a cycle, exporting/importing data, etc.
 * Implements the RideInterface for necessary operations.
 *
 * Author: tyang15
 */
public class Ride implements RideInterface {
    private String rideName;                         // Name of the ride
    private int maxRiders;                           // Maximum number of riders allowed in one cycle
    private Employee operator;                       // Operator responsible for the ride
    private Queue<Visitor> visitorQueue = new LinkedList<>(); // Queue for managing visitors waiting for the ride
    private List<Visitor> rideHistory = new ArrayList<>();    // List to track the visitors who have ridden
    private int numOfCycles = 0;                     // Tracks the number of completed ride cycles

    // Default constructor
    public Ride() {
    }

    /**
     * Parameterized constructor to initialize the ride with its name, max riders, and operator.
     *
     * @param rideName  The name of the ride.
     * @param maxRiders The maximum number of riders for each cycle.
     * @param operator  The operator in charge of the ride.
     */
    public Ride(String rideName, int maxRiders, Employee operator) {
        this.rideName = rideName;
        this.maxRiders = maxRiders;
        this.operator = operator;
    }

    // Getters and setters for the class fields

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getMaxRiders() {
        return maxRiders;
    }

    public void setMaxRiders(int maxRiders) {
        this.maxRiders = maxRiders;
    }

    public Employee getOperator() {
        return operator;
    }

    public void setOperator(Employee operator) {
        this.operator = operator;
    }

    public int getNumOfCycles() {
        return numOfCycles;
    }

    public int getSizeOfVisitorQueue(){
        return visitorQueue.size();
    }

    // Queue-related methods for managing visitors

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Visitor cannot be null.");
            return;
        }
        visitorQueue.offer(visitor); // Using offer instead of add for better error handling
        System.out.printf("%s has joined the queue for %s.%n", visitor.getName(), rideName);
    }

    @Override
    public void removeVisitorFromQueue() {
        Visitor removedVisitor = visitorQueue.poll(); // Safely remove the first visitor from the queue
        if (removedVisitor != null) {
            System.out.printf("%s has been removed from the queue for %s.%n", removedVisitor.getName(), rideName);
        } else {
            System.out.printf("The queue for %s is empty. No visitor to remove.%n", rideName);
        }
    }

    @Override
    public void printQueue() {
        if (visitorQueue.isEmpty()) {
            System.out.printf("The queue for %s is currently empty.%n", rideName);
        } else {
            System.out.printf("Visitors in the queue for %s:%n", rideName);
            visitorQueue.forEach(visitor ->
                    System.out.printf("- %s (TicketId: %s)%n", visitor.getName(), visitor.getTicketId()));
        }
    }

    // Running a cycle of the ride
    @Override
    public void runOneCycle() {
        // Ensure there is an operator assigned to the ride
        if (operator == null) {
            System.out.printf("The ride %s cannot be run because no operator is assigned.%n", rideName);
            return;
        }

        // Ensure there are visitors in the queue
        if (visitorQueue.isEmpty()) {
            System.out.printf("The ride %s cannot be run because the queue is empty.%n", rideName);
            return;
        }

        // Run the ride for one cycle
        int riders = 0;
        System.out.printf("Running one cycle for %s...%n", rideName);
        while (riders < maxRiders && !visitorQueue.isEmpty()) {
            Visitor visitor = visitorQueue.poll(); // Remove the visitor from the queue
            if (visitor != null) {
                addVisitorToHistory(visitor); // Add the visitor to the ride history
                System.out.printf("%s is enjoying the ride %s.%n", visitor.getName(), rideName);
                riders++;
            }
        }

        // Increment the cycle count
        numOfCycles++;
        System.out.printf("Cycle completed. Total cycles run for %s: %d%n", rideName, numOfCycles);
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor); // Adds the visitor to the ride history
        System.out.printf("%s has been added to the ride history for %s.%n", visitor.getName(), rideName);
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        boolean found = rideHistory.contains(visitor); // Checks if the visitor is in the history
        System.out.printf("%s is %s in the ride history for %s.%n", visitor.getName(),
                (found ? "" : "not "), rideName);
        return found;
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size(); // Returns the total number of visitors who have ridden
    }

    @Override
    public void printRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.printf("No visitors have taken the ride %s yet.%n", rideName);
        } else {
            System.out.printf("Ride history for %s:%n", rideName);
            rideHistory.forEach(visitor ->
                    System.out.printf("- %s (Age: %d)%n", visitor.getName(), visitor.getAge()));
        }
    }

    // Sort the ride history
    public void sortRideHistory() {
        rideHistory.sort(new VisitorComparator()); // Improved readability using method reference
        System.out.println("Ride history has been sorted.");
    }

    // Export ride history to a CSV file
    public void exportRideHistory(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // Write each visitor's data to the file
            for (Visitor visitor : rideHistory) {
                writer.write(String.format("%s,%d,%s,%s,%d%n", visitor.getName(), visitor.getAge(),
                        visitor.getGender(), visitor.getTicketId(), visitor.getMembershipId()));
            }
            System.out.printf("Ride history has been successfully exported to %s%n", filename);
        } catch (IOException e) {
            System.out.println("An error occurred while exporting ride history: " + e.getMessage());
        }
    }

    // Import ride history from a CSV file
    public void importRideHistory(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            // Read each line of the file
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(","); // Split the line by commas
                if (data.length == 5) {  // Ensure that the data is complete
                    // Create a new Visitor object and add it to the queue
                    String name = data[0];
                    int age = Integer.parseInt(data[1]);
                    String gender = data[2];
                    String ticketId = data[3];
                    int membershipId = Integer.parseInt(data[4]);

                    Visitor visitor = new Visitor(name, age, gender, ticketId, membershipId);
                    visitorQueue.add(visitor);
                }
            }
            System.out.printf("Ride history has been successfully imported from %s%n", filename);
        } catch (IOException | NumberFormatException e) {
            System.out.println("An error occurred while importing ride history: " + e.getMessage());
        }
    }
}
