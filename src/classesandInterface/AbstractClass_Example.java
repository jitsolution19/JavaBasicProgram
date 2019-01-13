package classesandInterface;

abstract class ClassA {
	public void methodA() {
		System.out.println("inside methoa A of Class A");
	}

	public abstract void methodB();
}

abstract class ClassB extends ClassA
{
public abstract void classBmethod();

}

public class AbstractClass_Example extends ClassB{

	@Override
	public void classBmethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}

}
