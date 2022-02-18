import java.io.*;

public class WriteExample {
    public static void main(String[] args) {
        try (PrintStream out = new PrintStream(new FileOutputStream("apple", true));) {
            out.println("Hello");
            out.println(1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
