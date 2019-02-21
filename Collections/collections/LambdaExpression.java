package collections;

interface temp {
	default void method1() {
		System.out.println("Inside Default method of interface");
	}

	static void method2() {
		System.out.println("Inside static method of interface");
	}

	abstract void method3();

}

public class LambdaExpression implements temp {

	public static void main(String[] args) {

		temp le = () -> System.out.println("Lamda Concept of implementing override method");
		le.method3();
		le.method1();		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub

	}

}
