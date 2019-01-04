package oopsLearning;

import org.junit.Test;

public class BhelShikshaNiketan extends School{

	@Test
	public void getRecord()
	{
		School sch = new School();
		sch.getRollNumber(100);
		sch.getName("Jitendra");
		sch.getsex('M');
	}
}
