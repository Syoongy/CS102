import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        partC();
    }

    public static void partA() {
        Scanner sc = new Scanner(System.in);
        int inputVal = 0;
        char c = 'a';

        System.out.print("Enter size: ");
        inputVal = sc.nextInt();

        for (int i = 0; i < inputVal; i++) {
            if ((int) c > 122) {
                c = 'a';
            }
            System.out.print(c + " ");
            ++c;
        }

        sc.close();
    }

    public static void partB() {
        Scanner sc = new Scanner(System.in);
        int inputVal = 0;

        System.out.print("Enter size: ");
        inputVal = sc.nextInt();

        for (int i = 1; i <= inputVal; i++) {
            System.out.print("" + i + (i + 1) + (i + 2) + " ");
        }

        sc.close();
    }

    public static void partC() {
        Scanner sc = new Scanner(System.in);
        int inputVal = 0;

        // The number to print on the current line
        int numberToPrint = 1;

        System.out.print("Enter size: ");
        inputVal = sc.nextInt();

        for (int lineCount = 1; lineCount <= inputVal;) {

            // Check if the number to be printed is still less than the current line count
            // and print the number if it true before incrementing the number and starting
            // the next iteration of the loop
            if (numberToPrint < lineCount) {
                System.out.print(numberToPrint);
                numberToPrint++;
                continue;
            }

            // If the number to print is equivalent, we want to go to the next line
            if (numberToPrint == lineCount) {
                System.out.print(numberToPrint);
                System.out.println();
                lineCount++;
                numberToPrint = 1;
            }
        }

        sc.close();
    }
}