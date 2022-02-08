import java.util.ArrayList;
import java.util.Collections;
// class Bird {
//     public void makeNoise() {
//         System.out.println("tweet");
//     }
// }

// class Mynah extends Bird {
//     @Override
//     public void makeNoise() {
//         System.out.println("ya ya");
//     }

// }

class Test {

    public static void main(String[] args) {
        // Bird b = new Mynah();
        // b.makeNoise();
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person(12, "John"));
        personList.add(new Person(10, "Sally"));
        personList.add(new Person(13, "John"));
        personList.add(new Person(9, "Mark"));

        Collections.sort(personList, new PersonComparator());
        System.out.println(personList);
    }
}
