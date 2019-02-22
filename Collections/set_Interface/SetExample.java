package set_Interface;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
	
		Set<Integer> ss = new LinkedHashSet<>();
		ss.add(1);		
		ss.add(2);
		ss.add(3);
		ss.add(4);

		for(int value : ss)
		{
			System.out.println(value);
		}
		
		
	}

}
