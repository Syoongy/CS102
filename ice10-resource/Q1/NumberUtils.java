import java.util.*;

public class NumberUtils {
    public static void main(String[] args) {
        findPairs(new int[] { 3, 1, 2 }, 3);
    }

    public static Map<Integer, Integer> calculateFrequency(int[] arr) throws IllegalArgumentException {
        if (arr == null) {
            throw new IllegalArgumentException();
        }

        var retMap = new HashMap<Integer, Integer>();

        for (int val : arr) {
            int count = 1;
            if (retMap.containsKey(val)) {
                count = retMap.get(val) + 1;
            }
            retMap.put(val, count);
        }

        return retMap;
    }

    public static int[] createArray(Map<Integer, Integer> freqMap) throws IllegalArgumentException {
        if (freqMap == null) {
            throw new IllegalArgumentException();
        }

        var retArrList = new ArrayList<Integer>();

        Set<Integer> keys = freqMap.keySet();

        for (int key : keys) {
            int freqOfKey = freqMap.get(key);

            for (int i = 0; i < freqOfKey; i++) {
                retArrList.add(key);
            }
        }

        int[] retArr = new int[retArrList.size()];

        // return retArrList.stream().mapToInt(Integer::intValue).toArray()
        // Arrays.setAll(retArr, i -> Integer.parseInt(retArrList.get(i)));
        Arrays.setAll(retArr, retArrList::get);
        return retArr;
    }

    public static int max(int... arr) throws IllegalArgumentException {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }

        int retVal = 0;
        for (int val : arr) {
            if (val >= retVal) {
                retVal = val;
            }
        }
        return retVal;
    }

    public static List<Pair> findPairs(int[] arr, int value) {

        var retList = new ArrayList<Pair>();
        // Map<Integer, Integer> freqMap = null;
        // try {
        // freqMap = calculateFrequency(arr);
        // } catch (IllegalArgumentException e) {
        // return retList;
        // }

        // Iterator<Map.Entry<Integer, Integer>> entryIterator =
        // freqMap.entrySet().iterator();
        // while (entryIterator.hasNext()) {

        // int currKey = entryIterator.next().getKey();
        // int diffFromValue = Math.abs(currKey - value);
        // if (freqMap.containsKey(diffFromValue)) {
        // int frequency = freqMap.get(diffFromValue);
        // for (int i = 0; i < frequency; i++) {
        // retList.add(new Pair(diffFromValue, currKey));
        // }
        // }
        // entryIterator.remove();

        // }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == value) {
                    retList.add(new Pair(arr[i], arr[j]));
                }
            }

        }

        return retList;
    }
}
