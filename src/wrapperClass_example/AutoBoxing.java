package wrapperClass_example;

import org.junit.Test;

public class AutoBoxing {

	@Test
	public void autoboxingConcept() {
		System.out.println("Autoboxing help in saving  memory by reusing already created Wrapper objects");
		System.out.println("Two wrapper objects created using new are not same objects");
		Integer nineA = new Integer(9);
		Integer nineB = new Integer(9);
		System.out.println("nineA==nineB " + (nineA == nineB));
		System.out.println("nineA.equals(nineB) " + (nineA.equals(nineB)));

		System.out.println("Two wrapper objects created using boxing are same objects");
		Integer nineC = 9;
		Integer nineD = 9;
		System.out.println("nineC==nineD " + (nineC == nineD));
		System.out.println("nineC.equals(nineD) " + (nineC.equals(nineD)));

	}
}
