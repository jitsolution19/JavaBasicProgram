package collections;

import java.util.ArrayList;

public class PrintNumber_Using_Collection {

	public static void main(String[] args) {

		ArrayList<Integer> temp = new ArrayList<>();
		int i = 0;
		while (i < 100) {
			temp.add(i);
			i++;
		}

		temp.forEach((n) -> System.out.println("NUmber is as :: " + n));
		temp.forEach((n) -> {
			if (n % 2 == 0)
				System.out.println("Even NUmber is as :: " + n);
		});

	}
}