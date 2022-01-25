public class Student extends Person {
    private double gpa;

    /*
     * default generated constructor
     * public Student() {
     * super();
     * }
     */

    public Student(String name, double gpa) {
        this(name, 18, gpa);
    }

    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    @Override
    public String greet() {
        return super.greet() + String.format("! My name is %s, I am %d years old and have a GPA of %.1f", this.getName(),
                this.getAge(),
                this.gpa);
    }

    public static void main(String[] args) {
        Student s = new Student("Adam", 4.3);
        System.out.println(s.greet());
    }

    @Override
    public String toString() {
        return "Student [gpa=" + gpa + "]";
    }

    
}
