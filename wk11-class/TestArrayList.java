import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        for (String val : args) {
            System.out.println(val);
        }

        List<String> aList = new ArrayList<>();
        aList.add("apple");
        aList.add("orange");
        aList.add("pear");

        // How to convert list to array
        // String[] sArr = aList.toArray(new String[aList.size()]);
        String[] sArr = new String[aList.size()];
        aList.toArray(sArr);

        String[] retArr = aList.toArray(sArr);

        // Both will point to the same array as we have passed in the correct size
        // if we had instead used
        // String[] sArr = new String[0];
        // This will now print false instead
        // This is because toArray() will need to create and return a new array and only
        // uses the datatype of the argument
        System.out.println(retArr == sArr);
    }
}
