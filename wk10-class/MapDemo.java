import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> dict = new HashMap<>();
        dict.put("apple", 2); // Java autocast using Integer.valueOf(2)
        dict.put("pear", 5); // Java autocast using Integer.valueOf(2)
        dict.put("orange", 3); // Java autocast using Integer.valueOf(2)
        System.out.println(dict);

        // Iterator<String> iter = dict.keySet().iterator();
        // while (iter.hasNext()) {
        // String key = iter.next();
        // System.out.println(key + " " + dict.get(key));
        // }

        // Set<String> keys = dict.keySet();
        // for (String aVal : keys) {
        // System.out.println(aVal);
        // }

        // Treeset is sorted (more expensive)
        // Hashset is not sorted
        Set<String> values2 = new HashSet<>();
        values2.add("3");
        values2.add("1");
        values2.add("1");
        values2.add("4");
        values2.add("1");

        Iterator<String> iter = values2.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println(values2);
    }
}
