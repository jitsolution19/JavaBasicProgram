package javaPracticeProgram;

public class TryCatchLogic {

	public static void main(String[] args) {
		System.out.println(calculate(8));
	}

	private static int calculate(int number) {
		try {
			return (1000 / number);
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			System.out.println("Change the number");
		}
		return number;

	}
}
