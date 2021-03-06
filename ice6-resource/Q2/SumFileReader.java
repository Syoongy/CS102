import java.io.*;
import java.util.Scanner;

public class SumFileReader {

    public static Scanner getFileScanner(Scanner inputSc) {
        System.out.print("Enter filename > ");
        String inputVal = inputSc.nextLine();
        try {
            return new Scanner(new File(inputVal));
        } catch (FileNotFoundException e) {
            System.out.println(inputVal + " is invalid");
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);
        Scanner fileSc = null;
        int totalVal = 0;

        while (fileSc == null) {
            fileSc = getFileScanner(inputSc);
        }

        while (fileSc.hasNext()) {
            totalVal += fileSc.nextInt();
        }
        System.out.printf("The sum is %d%n", totalVal);

        inputSc.close();
        fileSc.close();
    }
}
