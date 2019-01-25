package oopsLearning;

import java.util.HashMap;

public class ObjectExample {

	public static void main(String[] args) {

		Object[] abc = { "Jitendra", 2, "Gupta", 100.40, 15f };
		System.out.println(abc.length);
		int i = 0;
		while (i < abc.length) {
			System.out.println(abc[i].toString());
			i++;
		}
		HashMap<Integer, Object[]> hm = new HashMap<>();
		hm.put(1, abc);
		System.out.println(hm.get(1));
		System.out.println(hm.values());
		Object[] temp = hm.get(1);
		int j = 0;
		System.out.println(temp.length);
		System.out.println(temp[4].toString());
		while (j < temp.length) {
			System.out.print(temp[j].toString()+"\t");
			j++;
		}

	}

}
