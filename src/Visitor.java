/**
 * Author: tyang15
 * The Visitor class extends the Person class, adding fields for ticket and membership information.
 */

public class Visitor extends Person {
    private String ticketId;  // Unique ID for the visitor's ticket
    private int membershipId; // Unique ID for the visitor's membership (if any)

    // Default constructor
    public Visitor() {
        super();  // Ensure parent class constructor is called
    }

    // Parameterized constructor to initialize Visitor with name, age, gender, ticket ID, and membership ID
    public Visitor(String name, int age, String gender, String ticketId, int membershipId) {
        super(name, age, gender);  // Calls the constructor of the parent class (Person)
        this.ticketId = ticketId;
        this.membershipId = membershipId;
    }

    // Getter for ticketId
    public String getTicketId() {
        return ticketId;
    }

    // Setter for ticketId
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    // Getter for membershipId
    public int getMembershipId() {
        return membershipId;
    }

    // Setter for membershipId
    public void setMembershipId(int membershipId) {
        this.membershipId = membershipId;
    }

    @Override
    public String toString() {
        return "Visitor{name='" + getName() + "', age=" + getAge() + ", gender='" + getGender() + "', ticketId='" + ticketId + "', membershipId=" + membershipId + "}";
    }
}
