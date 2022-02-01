package javaPracticeProgram;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World Program");
		integerexample();
		doubleexample();
		longexample();
	}

	public static void integerexample() {
		int num1 = 51236;
		int num2 = 71111;
		System.out.println("Output of Power is as " + (num1 * num2)); // Wrong Output because of the range issue
	}
	
	public static void doubleexample() {
		double num1 = 51236199;
		double num2 = 71111899;
		System.out.println("Output of Power is as " + (num1 * num2));
	}
	
	public static void longexample() {
		long num1 = 51236199;
		long num2 = 71111899;
		System.out.println("Output of Power is as " + (num1 * num2)/10000000);
	}
}
