package set_Interface;

import java.util.ArrayList;
import java.util.Arrays;

public class FindtheCommon {

	public static void main(String[] args) {

		ArrayList<Integer> arr1 = new ArrayList<Integer>(Arrays.asList(2, 3, 1, 5, 6, 7, 8));
		System.out.println("List 1 is as :: " + arr1);
		ArrayList<Integer> arr2 = new ArrayList<Integer>(Arrays.asList(2, 3, 11, 5, 6, 7, 8, 34, 1, 24, 34, 22));
		System.out.println("List 2 is as :: " + arr2);
		
		ArrayList<Integer> different = new ArrayList<Integer>(arr2);
		arr2.retainAll(arr1);
		System.out.println("Similar Element :: " + arr2);
		different.removeAll(arr2);
		System.out.println("Different Element :: " + different);
	}

}
