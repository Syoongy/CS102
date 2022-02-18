import java.io.*;
import java.util.*;

public class Fridge implements AutoCloseable {
    public void close() {
        System.out.println("Door closing");
    }

    public static void main(String[] args) {
        // Can accept more than 1 object
        try (AutoCloseable a = new Fridge();
                Scanner sc = new Scanner(new File("abc.txt"));) {
        } catch (Exception e) {
        }
    }
}
