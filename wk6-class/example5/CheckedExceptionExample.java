import java.io.*;
import java.util.*;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        // Checked exception when compiling
        // Scanner sc = null;
        // try {
        // sc = new Scanner(new File("info.txt"));
        // } catch (Throwable e) {
        // e.printStackTrace();
        // } finally {
        // if (sc != null) {
        // sc.close();
        // }
        // }

        // try-with-resource
        // Automatically closes the object once the try-catch has been completed
        // try (Scanner sc = new Scanner(new File("info.txt"));) {
        // while (sc.hasNext()) {
        // String[] columns = sc.nextLine().split(",");
        // System.out.println(columns[0]);
        // System.out.println(columns[1]);
        // System.out.println("----");
        // }
        // } catch (Throwable e) {
        // e.printStackTrace();
        // }

        try (Scanner sc = new Scanner(new File("info.txt"));) {
            sc.useDelimiter(",|\r\n|\n");
            while (sc.hasNext()) {
                System.out.println(sc.next());
                System.out.println(sc.nextInt());
                System.out.println("----");
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
