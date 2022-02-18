import java.io.*;
import java.util.Scanner;

public class SumRowFileReader {

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
        String[] columns;

        while (fileSc == null) {
            fileSc = getFileScanner(inputSc);
        }

        while (fileSc.hasNext()) {
            columns = fileSc.nextLine().split(",");
            totalVal = 0;
            for (int i = 0; i < columns.length; i++) {
                totalVal += Integer.parseInt(columns[i]);
            }
            System.out.println(totalVal);
        }

        inputSc.close();
        fileSc.close();
    }
}
