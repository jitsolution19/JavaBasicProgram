package hashMap;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfeachCharacter {

	public static void main(String[] args) {

		String value = "I love my Country";
		characterCount(value);

	}

	public static void characterCount(String value) {
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		char[] strArray = value.toCharArray();
		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		for (Map.Entry entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
