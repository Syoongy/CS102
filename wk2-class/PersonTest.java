public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person(13);
        Person p2 = new Person(12);

        System.out.println(p.isOlderThan(p2));
        System.out.println(p.getAge());
    }
}
