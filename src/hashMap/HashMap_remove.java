package hashMap;

import java.util.HashMap;

public class HashMap_remove {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "Let us C");
		map.put(102, "Operating System");
		map.put(103, "Data Communication and Networking");
		System.out.println("Values before remove: " + map);
		// Remove value for key 102
		map.remove(102);
		System.out.println("Values after remove: " + map);
		map.put(104,"NetWork Analysis");
		System.out.println(map.values());
	}

}
