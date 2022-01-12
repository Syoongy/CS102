import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String inputVal = sc.nextLine();

        System.out.print("Enter second word: ");
        String inputVal2 = sc.nextLine();

        while (inputVal.charAt(0) != inputVal2.charAt(0)) {
            System.out.println("try again\n");

            System.out.print("Enter first word: ");
            inputVal = sc.nextLine();

            System.out.print("Enter second word: ");
            inputVal2 = sc.nextLine();

        }

        System.out.println("Bingo");
        sc.close();
    }

}