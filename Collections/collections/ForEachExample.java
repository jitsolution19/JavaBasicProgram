package collections;

import java.util.ArrayList;
import org.junit.Test;

public class ForEachExample {

	@Test
	public void temp() {
		ArrayList<Integer> abc = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			abc.add(i);
		}

		for (Integer value : abc) {
			System.out.print(value);
		}

	}
}
