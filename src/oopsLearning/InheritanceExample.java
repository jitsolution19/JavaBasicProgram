package oopsLearning;

class classA {

	public int roll_number = 318850;

}

class classB extends classA {

	public String Name = "Jitendra";
	int roll_number = 38142;

	public void displayinfo() {
		System.out.println("Existing Employee ID ::  " + super.roll_number);
		System.out.println("Employee ID ::  " + this.roll_number);
		System.out.println("Name :: " + Name);
	}

}

public class InheritanceExample extends classB {

	public static void main(String[] args) {
		classB objB = new classB();
		objB.displayinfo();

	}

}
