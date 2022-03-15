import java.util.*;

public class Demo {

    public static void doSomething(List<String> values) {
        for (String s : values) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        List<String> values = new LinkedList<>();
        values.add("apple");
        values.add("orange");
        values.add("apple");
        values.add("apple");

        // doSomething(values);

        // int size = values.size();
        // for (int i = 0; i < size; i++) {
        // if (values.get(i).equals("apple")) {
        // values.remove(i);
        // }
        // }
        // System.out.println(values);

        // works from the back to iterate through the loop
        // for (int i = values.size() - 1; i >= 0; i--) {
        // if (values.get(i).equals("apple")) {
        // values.remove(i);
        // }
        // }
        // System.out.println(values);

        for (String s : values) {
            System.out.println(s);
        }

        Iterator<String> iter = values.iterator();
        while (iter.hasNext()) {
            // .next() always moves the pointer to the next element in the iterable
            // Code below produces [apple, orange, apple]
            // if (iter.next().equals("orange")) {
            // System.out.println("It's an orange");
            // } else if (iter.next().equals("apple")) {
            // iter.remove();
            // }
            // returns an instand of java.Lang.Object
            String val = (String) iter.next();
            if (val.equals("orange")) {
                System.out.println("It's an orange");
            } else if (val.equals("apple")) {
                iter.remove();
            }
        }
        System.out.println(values);
    }
}
