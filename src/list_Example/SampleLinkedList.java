package list_Example;

import java.util.Iterator;
import java.util.LinkedList;

public class SampleLinkedList {

	public static void main(String[] args) {

		LinkedList<String> name = new LinkedList<>();
		name.add("Jitendra");
		name.add("Akansha");
		name.add("Golu");
		name.add("Madhuri");
		name.addFirst("Mamta");
		name.addLast("Pari");
		Iterator<String> temp = name.iterator();
		while (temp.hasNext()) {
			System.out.println(temp.next());
		}
		
		System.out.println("===========================Updated list======================");
		name.push("Ramkumar");
		Iterator<String> temp1 = name.iterator();
		while (temp1.hasNext()) {
			System.out.println(temp1.next());
		}
		
		System.out.println("===========================Updated list======================");
		name.pop();
		Iterator<String> temp2 = name.iterator();
		while (temp2.hasNext()) {
			System.out.println(temp2.next());
		}
		
	}

}
