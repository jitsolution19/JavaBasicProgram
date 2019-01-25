package hashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap_Example {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(104, null);
		hm.put(null, "Akansha");
		hm.put(102, "Rahul");
		hm.put(null, "Jitendra");
		hm.put(103, null);
		
				
		for (Entry<Integer, String> m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}
		
		if(hm.containsKey(102))
		System.out.println("Input Key 102 is present ");
		System.out.println("Size of Hashmap is ::"+hm.size());
		System.out.println("Values Present in HashMap:: "+hm.values());
		System.out.println("Keyset Present in HashMap:: "+hm.keySet());		
		System.out.println("HashMap after clear method :: ");
		hm.clear();
		System.out.println("Values Present in HashMap:: "+hm.values());
		System.out.println("Keyset Present in HashMap:: "+hm.keySet());
	}
}
