/**
 * Employee class extends the Person class.
 * Represents an employee working in the theme park, including their unique ID and role.
 *
 * Author: tyang15
 */
public class Employee extends Person {
    // Private fields for Employee ID and Role
    private String employeeId;
    private String role;

    // Default constructor
    // This constructor is used when creating an Employee object without initial values.
    public Employee() {
        super(); // Ensures the Person constructor is called
    }

    /**
     * Constructor with parameters to initialize the Employee object with specific values.
     *
     * @param name       The name of the employee.
     * @param age        The age of the employee.
     * @param gender     The gender of the employee.
     * @param employeeId The unique ID of the employee.
     * @param role       The role of the employee (e.g., Ride Operator).
     */
    public Employee(String name, int age, String gender, String employeeId, String role) {
        super(name, age, gender); // Call the superclass (Person) constructor
        this.employeeId = employeeId;
        this.role = role;
    }

    // Getter and Setter for employeeId
    /**
     * Gets the employee's unique ID.
     *
     * @return The employee ID.
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets a new value for the employee's unique ID.
     *
     * @param employeeId The new employee ID.
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Getter and Setter for role
    /**
     * Gets the role of the employee.
     *
     * @return The role of the employee.
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets a new role for the employee.
     *
     * @param role The new role of the employee.
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Provides a string representation of the Employee object.
     *
     * @return A string representing the Employee's details.
     */
    @Override
    public String toString() {
        return "Employee { " +
                "Name='" + getName() + "', " +
                "Age=" + getAge() + ", " +
                "Gender='" + getGender() + "', " +
                "EmployeeId='" + employeeId + "', " +
                "Role='" + role + "' }";
    }

    /**
     * Displays a formatted message about the employee's role and ID.
     */
    public void displayEmployeeInfo() {
        System.out.printf("Employee [ID: %s] with Role: %s is working.\n", employeeId, role);
    }
}
