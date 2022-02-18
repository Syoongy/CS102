import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumFileReader {

    public static Scanner getFileScanner(Scanner inputSc) {
        System.out.print("Enter filename> ");
        String inputVal = inputSc.nextLine();
        try (Scanner fileScanner = new Scanner(new File(inputVal))) {
            return fileScanner;
        } catch (FileNotFoundException e) {
            System.out.println(inputVal + " is invalid");
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);
        System.out.print("Enter filename> ");
        Scanner fileScanner = null;
        while (fileScanner == null) {
            fileScanner = getFileScanner(inputSc);
        }
        // while (true) {
        // inputVal = inputSc.nextLine();

        // try (Scanner fileSc = new Scanner(new File(inputVal))) {

        // int totalVal = 0;
        // while (fileSc.hasNext()) {
        // totalVal += fileSc.nextInt();
        // }
        // System.out.printf("The sum is %d%n", totalVal);
        // break;

        // } catch (FileNotFoundException | InputMismatchException e) {
        // // In the case that the file contains strings as well as numbers
        // System.out.println(inputVal + " is invalid");
        // }

        // }

        inputSc.close();
    }
}
