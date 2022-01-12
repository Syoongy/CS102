import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputVal = 0;
        int totalVal = 1;
        String textToPrint = "";

        System.out.print("Enter number: ");
        inputVal = sc.nextInt();
        sc.nextLine();

        if (inputVal > 0) {
            while (inputVal > 0) {
                totalVal *= inputVal;
                textToPrint += inputVal + " x ";
                System.out.print("Enter number: ");
                inputVal = sc.nextInt();
                sc.nextLine();
            }
            textToPrint = textToPrint.substring(0, textToPrint.length() - 2);
            textToPrint += "= " + totalVal;
            System.out.println(textToPrint);

        } else {
            System.out.println("No positive number is entered");
        }

        sc.close();
    }
}