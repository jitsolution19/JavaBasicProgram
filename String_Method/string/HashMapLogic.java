package javaPracticeProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapLogic {
	public static void main(String[] args) {
		String[] customers = { "Raj", "tina", "jit", "ravi", "Raj", "Raj" };
		HashMap<String, Integer> temp = new HashMap<>();
		for (String name : customers) {
			if (temp.containsKey(name)) {
				temp.put(name, temp.get(name) + 1);
			} else {
				temp.put(name, 1);

			}
		}

		System.out.println(temp);
		System.out.println(temp.keySet());
		for (Entry<String, Integer> entry : temp.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + "   " + value.toString());
		}
	}

}
