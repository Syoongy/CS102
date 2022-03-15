import java.util.*;

public class MapUtility {

    public static void main(String[] args) {
        Map<String, String> input = new HashMap<>();
        input.put("Alfred", "81");
        input.put("Elise", "61");
        input.put("Billy", "41");
        input.put("Daniel", "41");
        input.put("Charlie", "54");

        System.out.println("Input:  " + input);
        Map<String, List<String>> result = reverse(input);
        System.out.println("Output: " + result);

    }

    public static Map<String, List<String>> reverse(Map<String, String> inputMap) {
        var retMap = new HashMap<String, List<String>>();
        Set<String> inputKeys = inputMap.keySet();

        // We iterate through all the current keys of the input map
        for (String inputKey : inputKeys) {

            // We retrieve the quiz scores
            String score = inputMap.get(inputKey).toString();
            List<String> tmpOutputList = new ArrayList<>();

            // Check if the reversed map already contains the score as a key
            if (retMap.containsKey(score)) {
                // If the key exists, we want to add this to the list that exist
                tmpOutputList = retMap.get(score);
            }

            tmpOutputList.add(inputKey);
            retMap.put(score, tmpOutputList);
        }

        return retMap;
    }
}
