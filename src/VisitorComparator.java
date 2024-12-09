import java.util.Comparator;

/**
 * The VisitorComparator class compares two Visitor objects first by their age,
 * and if they have the same age, it compares by their name alphabetically.
 *
 * Author: tyang15
 */
public class VisitorComparator implements Comparator<Visitor> {

    @Override
    public int compare(Visitor v1, Visitor v2) {
        // First compare by age
        int ageComparison = Integer.compare(v1.getAge(), v2.getAge());

        // If ages are equal, compare by name alphabetically
        if (ageComparison == 0) {
            return v1.getName().compareTo(v2.getName());
        }

        return ageComparison;  // Return the result of age comparison
    }
}
