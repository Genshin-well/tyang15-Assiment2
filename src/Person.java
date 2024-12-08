/**
 * Person class serves as a base class for all individuals in the system.
 * It holds the common properties of a person such as name, age, and gender.
 * This class is abstract and cannot be instantiated directly.
 *
 * Author: tyang15
 */
public abstract class Person {
    // Private fields to store personal information
    private String name;
    private int age;
    private String gender;

    // Default constructor
    // This constructor is used when creating a Person object without initial values.
    public Person() {
    }

    /**
     * Constructor with parameters to initialize the Person object with specific values.
     *
     * @param name   The name of the person.
     * @param age    The age of the person.
     * @param gender The gender of the person.
     */
    public Person(String name, int age, String gender) {
        // Initialize the name, age, and gender fields with the provided values
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter and Setter for name
    /**
     * Gets the name of the person.
     *
     * @return The name of the person.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets a new value for the name of the person.
     *
     * @param name The new name of the person.
     */
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    /**
     * Gets the age of the person.
     *
     * @return The age of the person.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets a new value for the age of the person.
     *
     * @param age The new age of the person.
     */
    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for gender
    /**
     * Gets the gender of the person.
     *
     * @return The gender of the person.
     */
    public String getGender() {
        return gender;
    }

    /**
     * Sets a new value for the gender of the person.
     *
     * @param gender The new gender of the person.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}
