package collections;

import java.util.ArrayList;

public class PrintNumber_Using_Collection {

	public static void main(String[] args) {
	
		ArrayList<Integer> temp= new ArrayList<>();
		int i =0;
		while(i<10)
		{
			temp.add(i);
			i++;
		}

		temp.forEach((n)->System.out.println("NUmber is as :: "+n));
	}

}
