import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    // vararg, array of args using '...'
    public static void doX(int... values) {
        for (int i : values) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        // doX(1);

        // HashSet, HashMap needs to make own hashCode method
        Set<Person> values = new HashSet<>();
        values.add(new Person("apple", 2));
        values.add(new Person("orange", 3));
        values.add(new Person("apple", 2));
        System.out.println(values);
    }
}
