import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputVal = "";
        System.out.print("Enter sentence: ");
        inputVal = sc.nextLine();
        String retStr = "";
        String[] tmpStrArr = inputVal.split(" ");
        for (int i = 0; i < tmpStrArr.length; i++) {
            retStr += (tmpStrArr[tmpStrArr.length - 1 - i] + " ");
        }
        System.out.println(retStr.trim() + "\n");
        sc.close();
    }
}