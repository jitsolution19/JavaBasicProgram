package set_Interface;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		String value = "I love my Country";
		char[] arr = value.toCharArray();
		HashSet<Character> hashss = new HashSet<>();
		int i = 0;
		while (i < arr.length) {

			hashss.add(arr[i]);
			i++;
		}

		for(Character temp : hashss)
		{
			System.out.println(temp);
		}
	}

}
