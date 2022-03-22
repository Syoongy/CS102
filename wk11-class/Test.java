import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Person> aList = new ArrayList<>(2);
        aList.add(new Person(1));
        aList.add(new Person(2));
        aList.add(new Person(3));
        aList.add(new Person(2));

        aList.remove(new Person(2));
        System.out.println(aList);
    }
}

/**
 * Person
 */
class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "" + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        return true;
    }

}
