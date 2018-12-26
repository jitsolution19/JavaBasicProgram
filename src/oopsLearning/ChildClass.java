package oopsLearning;

import org.junit.Test;

public class ChildClass extends ParentClass{
	
@Test()
public void testing()
{
//	this.name="Akansha";
	this.classname=this.getClass().getSimpleName();
	String exp=super.classname;

	System.out.println("I Love you "+exp);
//	System.out.println("I Love you "+exp);
	
	
}
}
