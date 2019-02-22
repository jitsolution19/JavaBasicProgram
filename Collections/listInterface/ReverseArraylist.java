package listInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		int i=0;
		while(i<10)
		{
			al.add(i);
			i++;
		}
		
		Iterator<Integer> temp = al.iterator();
		temp.forEachRemaining(a->{System.out.println(a);});
		
		System.out.println("======================= Reverse of number is====================== ");
		
		ListIterator<Integer> ll= al.listIterator(al.size()) ;
		while(ll.hasPrevious())
		{
			System.out.println(ll.previous());
		}
	}

}
