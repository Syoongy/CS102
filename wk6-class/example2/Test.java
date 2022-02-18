public class Test {
    public static void doSomething(int x, int y) {
        try {
            System.out.println("A");
            System.out.println(x / y);
            System.out.println("B");
        } catch (ArithmeticException e) {
            System.out.println("C");
        }
        System.out.println("D");
    }

    public static void main(String[] args) {
        doSomething(6, 0);

        // int x = 3;
        // int y = 0;
        // try {
        // System.out.println(x / y);
        // } catch (ArithmeticException e) {
        // System.out.println("Caught");
        // }
    }
}
