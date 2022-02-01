package javaPracticeProgram;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySorting {

	public static int additioninarray(int[] arr) {
		int v1 = 2;
		int v2 = 4;
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for(int a=0;a<arr.length;a++) {
			arr1.add(arr[a]);
		}
		arr1.add(v1);
		arr1.add(v2);
		Collections.sort(arr1);
		System.out.println(arr1);
		Object[] temp=arr1.toArray();
		int val = (int)temp[temp.length-3];
		return val;

	}

	public static void arraysorting(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		int k = 0;
		while (k < arr.length) {
			System.out.println(arr[k]);
			k++;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 3, 45, 3, 6 };
		arraysorting(arr);
		System.out.println("3rd largest Value is as "+additioninarray(arr));
	}
}
