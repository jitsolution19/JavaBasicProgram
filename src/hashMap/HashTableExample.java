package hashMap;

import java.util.Hashtable;

public class HashTableExample {
	public static void main(String[] args) {

		Hashtable<Integer, String> hast = new Hashtable<>();
//		hast.put(null, "Jitendra");
		hast.put(1, "Jitendra");
		hast.put(2, "Golu");
		System.out.println(hast.keys());
		System.out.println(hast.keySet());
		System.out.println(hast.values());
}
}