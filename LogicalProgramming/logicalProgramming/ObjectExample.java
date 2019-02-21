package logicalProgramming;

import org.junit.Test;

public class ObjectExample {

	@Test
	public void temp()
	{
		int x=5;int y =10;String acb = "testing";
		getvalue(5);
		getvalue(acb);
		getvalue("50");
		
	}
	
	public void getvalue(Object obj)
	{
		System.out.println(obj.toString());
	}
}
