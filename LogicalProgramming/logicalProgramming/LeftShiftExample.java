package logicalProgramming;

public class LeftShiftExample {

	public static void main(String[] args) {

		int value = 10;
		while (value > 0) {
			System.out.println(value << 2);
			value--;
		}

		value = 20;
		while (value > 0) {
			System.out.println(value >> 2);
			value--;
		}

	}

}
