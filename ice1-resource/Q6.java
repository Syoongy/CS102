import java.util.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string:");
        String input1 = sc.nextLine();
        System.out.print("Enter the second string:");
        String input2 = sc.nextLine();
        System.out.println();

        if (matchStrings(input1, input2)) {
            System.out.println("There is an alignment as shown above.");
        } else {
            System.out.println("No alignment can be found.");
        }
        sc.close();
    }

    // This method returns true if str2 can be aligned with str1
    // and false otherwise. If there is an alignment, this method
    // also prints out the alignment. See the sample runs of the
    // program for exact output of this method.
    public static boolean matchStrings(String str1, String str2) {
        boolean retBool = true;
        int prevIdx = 0, nextIdx = 0;
        String currCh, textToPrint = "";

        for (int i = 0; i < str2.length(); i++) {
            currCh = str2.charAt(i) + "";
            // We check if str1 contains the current character
            if (str1.contains(currCh)) {
                // We search for the index of the matching character starting from the previous
                // character index
                nextIdx = str1.indexOf(currCh, prevIdx);
                if (nextIdx - prevIdx > 1) {
                    // If the difference between the previous and next character is greater than 1,
                    // we want to add n-1 spaces before the character
                    textToPrint += " ".repeat(nextIdx - prevIdx - 1) + currCh;
                } else if (nextIdx != 0) {
                    // If the difference is less than 1 and the character is not the first one in
                    // the String, we want to add 1 space before the character
                    textToPrint += " " + currCh;
                } else {
                    // The character is the first one in the String
                    textToPrint += currCh;
                }
                prevIdx = nextIdx;
            } else {
                retBool = false;
                break;
            }
        }

        System.out.println(str1);
        System.out.println(textToPrint);
        return retBool;
    }

}
