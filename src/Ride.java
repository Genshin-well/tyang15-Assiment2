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
public class Ride {
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


}
