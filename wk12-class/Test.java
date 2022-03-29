import java.util.*;

class Person {
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int hashCode() {
        // We use name and age to create the hash
        return Objects.hash(name, age);
        // infinite loop
        // return Objects.hashCode(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person another = (Person) obj;
        return name.equals(another.name) && age == another.age;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }

}

public class Test {
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();

        people.add(new Person(1, "james"));
        people.add(new Person(2, "Alice"));
        people.add(new Person(1, "james"));

        System.out.println(people);
    }
}
