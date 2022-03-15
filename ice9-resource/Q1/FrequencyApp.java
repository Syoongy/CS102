import java.util.*;

public class FrequencyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var inputFreqMap = new HashMap<String, Integer>();

        System.out.print("Enter the word: ");
        String inputVal = sc.nextLine();

        // We only continue if the input is not blank
        while (!inputVal.isBlank()) {

            int count;
            // Check if the HashMap already contains the key
            // increment if it already exist or instantiate with value of 1
            if (inputFreqMap.containsKey(inputVal)) {
                count = inputFreqMap.get(inputVal) + 1;
            } else {
                count = 1;
            }
            inputFreqMap.put(inputVal, count);

            System.out.print("Enter the word: ");
            inputVal = sc.nextLine();
        }

        System.out.println("\nFrequency Count:");

        // Iterate through the keys of the HashMap and print it's value
        for (String key : inputFreqMap.keySet()) {
            System.out.println(inputFreqMap.get(key) + " " + key);
        }
    }

}