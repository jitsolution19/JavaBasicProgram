package basicjavaProject;

import org.junit.Test;

public class This_Super_Final_Static {

	static String val = "Jeetendra";
	String val2 = "home";
	final String val3 = "tribute";

	@Test
	public void method() {

		System.out.println(val);
		val2 = "newValue";

		System.out.println(this.val2);

		System.out.println(val2);
		System.out.println(this.val3);

	}

}
