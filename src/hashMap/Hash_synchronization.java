package hashMap;

import java.util.HashMap;
import java.util.Hashtable;

public class Hash_synchronization {

	public static void main(String[] args) {
		Hashtable<Integer, String> hast = new Hashtable<>();
		hast.put(1, "Jitendra");
		hast.put(2, "Golu");
		System.out.println("HashTable Sync");
		System.out.println(hast.keySet());
		System.out.println(hast.values());

		System.out.println("HashMap UnSync");
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Jitendra");
		hm.put(2, "Golu");
		System.out.println(hm.keySet());
		System.out.println(hm.values());

	}

}
