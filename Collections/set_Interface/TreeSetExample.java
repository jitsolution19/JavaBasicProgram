package set_Interface;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("A");
		set.add("D");
		set.add("E");
		set.add("B");
		set.add("C");
		

		System.out.println("Intial Set: " + set);

		System.out.println("Head Set: " + set.headSet("D"));

		System.out.println("SubSet: " + set.subSet("A", "E"));

		System.out.println("TailSet: " + set.tailSet("C"));
		
		System.out.println("SubSet: "+set.subSet("A", false, "E", true)); 

		
		for(String val:set)
		{
			System.out.println(val);
		}
	}

}
