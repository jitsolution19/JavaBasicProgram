package set_Interface;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_ArrangementOfName {

	public static void main(String[] args) {
	
		String [] name = {"Ravi","Tarun","Vikas","Sanjay","Ravi Gupta","Sooraj"};
		SortedSet<String> value = new TreeSet<>();
		int i =0;
		while(i <name.length)
		{
			value.add(name[i]);
			i++;
		}

		for(String namesorted : value)
		{
			System.out.println("Name are as :: "+namesorted);
		}
	}

}
