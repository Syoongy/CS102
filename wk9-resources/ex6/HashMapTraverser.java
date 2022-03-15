import java.util.*;

public class HashMapTraverser {
	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 3);
		map.put(1, 2);
		map.put(-2, -2);
		map.put(-3, 4);

		HashMap<Integer, Boolean> map2 = new HashMap<Integer, Boolean>();
		map2.put(0, true);
		map2.put(1, true);
		map2.put(2, false);
		map2.put(3, true);

		HashMapTraverser.printAllPositiveKeys(map);
		HashMapTraverser.printAllPositiveValues(map);
		HashMapTraverser.printAllKeysWithValuesEqualToTrue(map2);
		System.out.println(HashMapTraverser.checkIfBothKeysExist(map,1,4));
		System.out.println(HashMapTraverser.checkIfBothKeysExist(map,1,-3));
	}

	//  Implement missing methods here


	// ********************************

}
