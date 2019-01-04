package oopsLearning;

import org.junit.Test;

class Area {
	public void area(int size) {
		System.out.println("Area of Sqaure :: " + size * size);
	}
	
	public void area(int length,int breadth) {
		System.out.println("Area of Rectangle :: " + length * breadth);
	}
}

public class MethodOverloadingExample extends Area{

	@Test
	public void getArea()
	{
		Area obj = new Area();
		obj.area(10);
		obj.area(5, 9);
	}
}
