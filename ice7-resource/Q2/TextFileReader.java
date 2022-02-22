import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TextFileReader {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        String fileNameAndPath = "data/students.txt";
        try {
            Scanner fileSc = new Scanner(new File(fileNameAndPath));
            System.out.println("Yes, " + fileNameAndPath + " exists");
        } catch (FileNotFoundException e) {
            System.out.println("No, " + fileNameAndPath + " does not exists");
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
