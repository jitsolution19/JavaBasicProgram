package wrapperClass_example;

import org.junit.Test;

public class WrapperExample {

	@Test
	public void intconverter() {
		String value = "10";
		Integer output = new Integer(value);
		System.out.println("Multiplication of the value is :: " + output * 5);
	}

}
