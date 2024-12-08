import java.util.List;

/**
 * RideInterface defines the operations that can be performed on a ride in an amusement park.
 * These operations include managing the visitor queue, running ride cycles, and maintaining ride history.
 */
public interface RideInterface {

    /**
     * Adds a visitor to the queue for the ride.
     *
     * @param visitor The visitor to be added to the queue.
     */
    void addVisitorToQueue(Visitor visitor);

    /**
     * Removes a visitor from the queue for the ride.
     * Typically removes the first visitor in the queue (FIFO).
     */
    void removeVisitorFromQueue();

    /**
     * Prints the current list of visitors in the queue for the ride.
     * Displays the name and ticket ID of each visitor.
     */
    void printQueue();

    /**
     * Runs one cycle of the ride with a maximum number of riders.
     * Visitors are taken from the queue and added to the ride's history.
     */
    void runOneCycle();

    /**
     * Adds a visitor to the ride's history after they have completed the ride.
     *
     * @param visitor The visitor who has completed the ride.
     */
    void addVisitorToHistory(Visitor visitor);

    /**
     * Checks if a specific visitor is already in the ride history.
     *
     * @param visitor The visitor to check for.
     * @return True if the visitor is in the history, otherwise false.
     */
    boolean checkVisitorFromHistory(Visitor visitor);

    /**
     * Returns the total number of visitors who have ridden the ride.
     *
     * @return The number of visitors in the ride history.
     */
    int numberOfVisitors();

    /**
     * Prints the ride history, listing all visitors who have ridden the attraction.
     * Displays the name and age of each visitor.
     */
    void printRideHistory();
}
