import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.*;

public class Example {
    public static void doX() throws FileNotFoundException {
        // 2 ways
        // 1) handle the error (try-catch)
        // try {
        // Scanner sc = new Scanner(new File("test.txt"));
        // } catch (Exception e) {
        // // Swallow the exception = do nothing at all

        // // Print at the minimum
        // e.printStackTrace();
        // // Logging framework
        // Logger log = Logger.getLogger("a");
        // log.log(Level.SEVERE, "Something bad has happened", e);
        // }

        // 2) propogate the exception
        Scanner sc = new Scanner(new File("test.txt"));
    }

    public static void doY() {
        try {
            doX();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void doZ(int x, int y) throws Exception {
        // try {
        // System.out.println(x / y);
        // } catch (ArithmeticException e) {
        // e.printStackTrace();
        // }

        // System.out.println(x / y);

        // Bad practice, should provide as specific as possible
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            throw new Exception();
        }
    }

    public static void main(String[] args) {
        // try {
        // doX();
        // } catch (FileNotFoundException e) {
        // e.printStackTrace();
        // }

        // doY();

        doZ(1, 0);
    }
}
