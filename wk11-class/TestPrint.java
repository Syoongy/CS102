import java.util.Arrays;

public class TestPrint {
    int y = 5;
    {
        y = 2;
    }
    static int x;

    public static void main(String[] args) {
        // byte, short, int, Long -> 0
        // float, double -> 0.0
        // boolean -> false
        // char -> \u0000

        String[] sArr = new String[3];
        String s = "abc";
        sArr[2] = sArr[1] = sArr[0] = s;
        System.out.println(Arrays.toString(sArr));

        // If the value is static, both t1 and t2 point to the same x
        // Thus, they will both print 2
        TestPrint t1 = new TestPrint();
        TestPrint t2 = new TestPrint();
        t1.x++;
        t2.x++;
        System.out.println(t1.x);
        System.out.println(t2.x);

        System.out.println(t1.y);

        // Only can use this on initialisation
        int[] arr = { 1, 2 };

        // This will fail and cause a compile error
        // arr = {3,5};

        // This works inside the curly brace as we already are referencing a varaible
        // outside the curly brace
        {
            // This will work as a new array in instantiated
            arr = new int[] { 3, 5, 6 };
        }
        System.out.println(Arrays.toString(arr));
    }
}
