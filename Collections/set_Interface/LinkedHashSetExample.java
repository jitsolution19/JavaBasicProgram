package set_Interface;

import java.util.LinkedHashSet;

/*LinkedHashSet class represents the LinkedList implementation of Set Interface. 
 * It extends the HashSet class and implements Set interface. Like HashSet, 
It also contains unique elements. It maintains the insertion order and permits null elements.
*/
public class LinkedHashSetExample {

	public static void main(String[] args) {

		String value = "I love my Country";
		char[] arr = value.toCharArray();
		LinkedHashSet<Character> hashss = new LinkedHashSet<>();
		int i = 0;
		while (i < arr.length) {

			hashss.add(arr[i]);
			i++;
		}

		for (Character temp : hashss) {
			System.out.println(temp);
		}
	}

}