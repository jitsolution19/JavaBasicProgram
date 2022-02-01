package javaPracticeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {

	
	public static void main(String[] args) {
		List<Integer>arr = new ArrayList<Integer>(Arrays.asList(1,2,34,56));
		System.out.println(arr.size());
		print(arr);
	}
public static void print(List<Integer>arr) {
	arr.size();
	int x=6,y=8;
	Integer a = new Integer(x);
	Integer b = new Integer(y);
	float ab = a.floatValue();
	float cd = b.floatValue();
	System.out.println(ab/cd);
	float t1 = (float)x;
	float t2 = (float)y;
	System.out.println(t1/t2);
}
}
