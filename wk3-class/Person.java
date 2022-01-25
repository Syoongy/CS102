public class Person {
    private int age;
    private String name;

    public Person() {
        this("Nameless", 0);
    }

    public Person(String name) {
        this(name, 18);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String greet() {
        return "Hi";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
        Person p = new Person("Adam");
        System.out.println(p.greet());
    }
}