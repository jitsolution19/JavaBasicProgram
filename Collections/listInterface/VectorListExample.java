package listInterface;

import java.util.Vector;

public class VectorListExample {

	public static void main(String[] args) {
		
		Vector<Integer> vec = new Vector<>();
		vec.add(1);
		vec.add(2);
		vec.add(3);
		vec.add(1);
		for(int k:vec)
		{
			System.out.println(k);
		}
		
	}

}
