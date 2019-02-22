package listInterface;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>();
		int i=0;
		while(i<10)
		{
			al.add(i);
			i++;
		}
		
		for(Integer K : al)
		{
			System.out.println("Output::"+K);
		}
		
		
	}

}
