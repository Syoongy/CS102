public class Person {
    private int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isOlderThan(Person p) {
        return this.age - p.age > 0;
    }
}