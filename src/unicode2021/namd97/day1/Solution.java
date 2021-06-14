/**
 * 
 */
package unicode2021.namd97.day1;

// scored 100%

/**
 * @author Duncan Nam
 *
 */
import java.util.*;

public class Solution {
	public static String[] updateAdministratumRecord(int value, String key, String[] input) {
		/*
		 * Check if the value and key are valid
		 */
		if (value < 0 || key.contains(":")) {
			return new String[] {};
		}

		/*
		 * Convert the input into a HashMap that can be iterated over
		 */
		HashMap<String, Integer> inputConverted = new HashMap<String, Integer>();
		for (String in : input) {
			/*
			 * Split the input via the colon. There should only be two values per input, and
			 * the second one should strictly be an integer.
			 */
			String[] temp = in.split(":");
			if (temp.length > 2 || !temp[1].matches("[0-9]+")) {
				return new String[] {};
			}
			/*
			 * Any multiples of the same key in the input need to be folded together, so if
			 * the key already exists in the HashMap, remove the existing one and update it.
			 */
			if (inputConverted.keySet().contains(temp[0])) {
				String label = temp[0];
				int val = inputConverted.get(temp[0]) + Integer.parseInt(temp[1]);
				inputConverted.remove(temp[0]);
				inputConverted.put(label, val);
			} else {
				inputConverted.put(temp[0], Integer.parseInt(temp[1]));
			}
		}

		/*
		 * If the HashMap already contains a given key, then add the value to the
		 * existing value in the HashMap. Otherwise, add a new entry with the value and
		 * key.
		 */
		if (inputConverted.keySet().contains(key)) {
			int val = inputConverted.get(key) + value;
			inputConverted.remove(key);
			inputConverted.put(key, val);
		} else {
			inputConverted.put(key, value);
		}

		/*
		 * The challenge involves the final output sorted by the value of the key-value
		 * pair. So, create a List containing all the Map Entries from the HashMap. Then
		 * sort the List with a custom Comparator, via an anonymous class, to sort via
		 * the value of the Map Entry.
		 */
		// NOTE: This can be optimised further using a lambda function in Java 8+.
		List<Map.Entry<String, Integer>> inputList = new LinkedList<Map.Entry<String, Integer>>(
				inputConverted.entrySet());
		Collections.sort(inputList, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});

		/*
		 * Now create a LinkedHashMap, a well ordered HashMap, and iterate over the
		 * inputList adding the entries to the LinkedHashMap.
		 */
		HashMap<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : inputList) {
			sortedMap.put(aa.getKey(), aa.getValue());
		}

		/*
		 * Create the output array.
		 */
		String[] output = new String[sortedMap.size()];

		/*
		 * Iterate over the LinkedHashMap, adding to the output the final results in the
		 * intended order.
		 */
		// NOTE: This can be optimised further with the removal of the LinkedHashMap,
		// and the use of a StringBuffer.
		Set set = sortedMap.entrySet();
		Iterator iterator = set.iterator();
		int point = sortedMap.size() - 1;
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			output[point] = entry.getKey() + ":" + entry.getValue();
			point--;
		}

		return output;

	}
}