package oopsLearning;

public class School implements StudentRecord {

	@Override
	public void getName(String name) {
		System.out.println("Student Name :: " + name);
	}

	@Override
	public void getRollNumber(int rollnumber) {
		System.out.println("Roll number :: " + rollnumber);

	}

	@Override
	public void getsex(char sex) {
		System.out.println("SEX :: " + sex);

	}

}
