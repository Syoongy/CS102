import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Adder {
    public static void main(String[] args) {
        Scanner inputSc = new Scanner(System.in);

        int num1 = getNumberFromUser("Enter num 1> ", inputSc);

        int num2 = getNumberFromUser("Enter num 2> ", inputSc);

        int sum = num1 + num2;

        System.out.println();
        System.out.println("The answer is " + sum);

        inputSc.close();
    }

    public static int getNumberFromUser(String promptString, Scanner inputSc) {

        while (true) {

            try {
                System.out.print(promptString);
                return inputSc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number!");
                inputSc.nextLine();
            }

        }
    }
}