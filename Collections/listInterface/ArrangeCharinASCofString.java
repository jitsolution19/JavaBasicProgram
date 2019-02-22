package listInterface;

import java.util.PriorityQueue;
import java.util.Queue;

public class ArrangeCharinASCofString {

	public static void main(String[] args) {
		
		String value = "Jeetendra";
		char[] arr = value.toUpperCase().toCharArray();
		Queue<Character> quee = new PriorityQueue<>();
		int i =0;
		while(i<arr.length)
		{
			quee.add(arr[i]);
			i++;
		}
		
		for(Object temp:quee)
		{
		System.out.println(temp.toString());
		}
	}

}
