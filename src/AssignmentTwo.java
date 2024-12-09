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
        // Part 4B implementation
        Employee operator = new Employee("Bob", 40, "Male", "E102", "Ride Operator");
        Ride thunderStorm = new Ride("Thunderstorm", 4, operator);

        // Create 6 new visitors with varied data
        Visitor visitor1 = new Visitor("Tom", 25, "Male", "V101", 12345);
        Visitor visitor2 = new Visitor("Sheryl", 22, "Female", "V102", 67890);
        Visitor visitor3 = new Visitor("Ben", 28, "Male", "V103", 54321);
        Visitor visitor4 = new Visitor("David", 24, "Female", "V104", 98765);
        Visitor visitor5 = new Visitor("Jack", 30, "Male", "V105", 11223);
        Visitor visitor6 = new Visitor("Lee", 30, "Female", "V106", 33211);

        // Add visitors to the ride history
        thunderStorm.addVisitorToHistory(visitor1);
        thunderStorm.addVisitorToHistory(visitor2);
        thunderStorm.addVisitorToHistory(visitor3);
        thunderStorm.addVisitorToHistory(visitor4);
        thunderStorm.addVisitorToHistory(visitor5);
        thunderStorm.addVisitorToHistory(visitor6);

        // Print all visitors before sorting
        System.out.println("\nVisitors before sorting:");
        thunderStorm.printRideHistory();

        // Sort the ride history
        thunderStorm.sortRideHistory();

        // Print all visitors after sorting
        System.out.println("\nVisitors after sorting:");
        thunderStorm.printRideHistory();
    }

    public void partFive() {
        // Part 5 implementation
        Employee operator = new Employee("Bob", 40, "Male", "E102", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 3, operator);  // Maximum passengers = 3

        // Add at least 10 visitors to the queue
        Visitor visitor1 = new Visitor("Tom", 25, "Male", "V101", 11111);
        Visitor visitor2 = new Visitor("Sherly", 22, "Female", "V102", 22222);
        Visitor visitor3 = new Visitor("Ben", 28, "Male", "V103", 33333);
        Visitor visitor4 = new Visitor("David", 24, "Female", "V104", 44444);
        Visitor visitor5 = new Visitor("Jack", 30, "Male", "V105", 55555);
        Visitor visitor6 = new Visitor("Lee", 30, "Female", "V106", 66666);
        Visitor visitor7 = new Visitor("Sharon", 22, "Female", "V107", 77777);
        Visitor visitor8 = new Visitor("Benny", 28, "Male", "V108", 88888);
        Visitor visitor9 = new Visitor("Leo", 24, "Female", "V109", 99999);
        Visitor visitor10 = new Visitor("Nehemia", 30, "Male", "V110", 12345);

        // Add visitors to the queue
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);
        rollerCoaster.addVisitorToQueue(visitor4);
        rollerCoaster.addVisitorToQueue(visitor5);
        rollerCoaster.addVisitorToQueue(visitor6);
        rollerCoaster.addVisitorToQueue(visitor7);
        rollerCoaster.addVisitorToQueue(visitor8);
        rollerCoaster.addVisitorToQueue(visitor9);
        rollerCoaster.addVisitorToQueue(visitor10);

        // Print the current queue before the cycle
        System.out.println("\nVisitors in queue before the cycle:");
        rollerCoaster.printQueue();

        // Run one cycle
        rollerCoaster.runOneCycle();

        // Print the queue after the cycle
        System.out.println("\nVisitors in queue after the cycle:");
        rollerCoaster.printQueue();

        // Print the ride history
        System.out.println("\nRide history:");
        rollerCoaster.printRideHistory();
    }

    public void partSix() {
        // Part 6 implementation
        Employee operator = new Employee("Alice", 35, "Female", "E101", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 2, operator);

        // Create 5 new visitors
        Visitor visitor1 = new Visitor("Jack", 25, "Male", "V101", 111);
        Visitor visitor2 = new Visitor("Sharon", 22, "Female", "V102", 222);
        Visitor visitor3 = new Visitor("Benny", 28, "Male", "V103", 333);
        Visitor visitor4 = new Visitor("Leo", 24, "Female", "V104", 444);
        Visitor visitor5 = new Visitor("Nehemia", 30, "Male", "V105", 555);

        // Add visitors to the ride history
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);
        rollerCoaster.addVisitorToHistory(visitor3);
        rollerCoaster.addVisitorToHistory(visitor4);
        rollerCoaster.addVisitorToHistory(visitor5);

        rollerCoaster.exportRideHistory("history.csv");
    }

    public void partSeven() {
        // Part 7 implementation - Export and Import ride data
        Ride rollerCoaster = new Ride("Roller Coaster", 3, new Employee("John", 30, "Male", "E103", "Ride Operator"));

        // Import data from file (assuming an import method)
        rollerCoaster.importRideHistory("history.csv");

        // Verify if the data is loaded correctly
        System.out.println("\nImported ride data: ");
        rollerCoaster.printQueue();
    }
}
