package listInterface;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<Integer> link = new LinkedList<>();

		int i = 0;
		while (i < 10) {
			link.add(i);
			i++;
		}

		for (Integer K : link) {
			System.out.println("Output::" + K);
		}
	}

}
