package set_Interface;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_Example {

	public static void main(String[] args) {

		String value = "I love my Country";
		char[] arr = value.toCharArray();
		SortedSet<Character> hashss = new TreeSet<>();
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


