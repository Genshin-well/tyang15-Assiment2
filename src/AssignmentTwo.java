/**
 * AssignmentTwo Class
 *
 * This class contains different parts that simulate the operation of a theme park ride.
 * It includes creating rides, adding visitors, handling the queue, checking ride history,
 * and exporting/importing ride data.
 * Author: tyang15
 */

public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
//        assignment.partThree();
//        assignment.partFourA();
//        assignment.partFourB();
//        assignment.partFive();
//        assignment.partSix();
//        assignment.partSeven();
    }

    public void partThree() {
        // Create a new Employee who will operate the ride
        Employee operator = new Employee("Alice", 35, "Female", "E101", "Ride Operator");

        // Create a new Ride object
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        // Create 5 new visitors with varied data
        Visitor visitor1 = new Visitor("Jack", 25, "Male", "V101", 12345);
        Visitor visitor2 = new Visitor("Sharon", 22, "Female", "V102", 54321);
        Visitor visitor3 = new Visitor("Benny", 28, "Male", "V103", 98765);
        Visitor visitor4 = new Visitor("Leo", 24, "Female", "V104", 11223);
        Visitor visitor5 = new Visitor("Nehemia", 30, "Male", "V105", 33211);

        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);

        // Print the queue before removing a visitor
        System.out.println("Queue before removing a visitor:");
        rollerCoaster.printQueue();

        // Remove a visitor from the queue
        rollerCoaster.removeVisitorFromQueue();

        // Print the queue after removal
        System.out.println("\nQueue after removing a visitor:");
        rollerCoaster.printQueue();
    }

    public void partFourA() {
        // Part 4A implementation
        Employee operator = new Employee("Alice", 35, "Female", "E101", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        // Create 5 new visitors with varied data
        Visitor visitor1 = new Visitor("Tom", 27, "Male", "V201", 67890);
        Visitor visitor2 = new Visitor("Grace", 23, "Female", "V202", 34567);
        Visitor visitor3 = new Visitor("Jack", 29, "Male", "V203", 24680);
        Visitor visitor4 = new Visitor("Lucy", 26, "Female", "V204", 13579);
        Visitor visitor5 = new Visitor("Matthew", 32, "Male", "V205", 86420);

        // Add visitors to the ride history
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);

        // Check if a visitor is in the ride history
        rollerCoaster.checkVisitorFromHistory(visitor3);
        rollerCoaster.checkVisitorFromHistory(new Visitor("Demo", 29, "Male", "V206", 55555));

        // Print the total number of visitors in ride history
        System.out.println("\nTotal visitors in ride history: " + rollerCoaster.numberOfVisitors());

        // Print all visitors in the ride history
        System.out.println("\nAll visitors in ride history:");
        rollerCoaster.printRideHistory();
    }

    public void partFourB() {
       
    }

    public void partFive() {

    }

    public void partSix() {

    }

    public void partSeven() {

    }
}
