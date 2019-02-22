package map_Interface;

import java.util.Hashtable;
import java.util.Map;
/*Hashtable is synchronized. It is thread-safe and can be shared with many threads.
Hashtable doesn't allow any null key or value.
Hashtable is slow.
Hashtable is internally synchronized and can't be unsynchronized.
Hashtable inherits Dictionary class.
*/
public class HashTable_example {

	public static void main(String[] args) {
		Hashtable<Integer, String> map = new Hashtable<Integer, String>();
		map.put(100, "Amit");
		map.put(102, "Ravi");
		map.put(101, "Vijay");
		map.put(103, "Rahul");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		System.out.println("Before remove: " + map);
		// Remove value for key 102
		map.remove(102);
		System.out.println("After remove: " + map);

		map.putIfAbsent(104, "Gaurav");
		System.out.println("Updated Map: " + map);
		// Returns the current value, as the specified pair already exist
		map.putIfAbsent(101, "Vijay");
		System.out.println("Updated Map: " + map);
	}

}
