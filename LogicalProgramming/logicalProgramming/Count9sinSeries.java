package logicalProgramming;

public class Count9sinSeries {

	public static void main(String[] args) {
		int requirednumber = 5;
		int number = 55;
		int reminder = 0;
		int temp = 0;
		do {
			if (number % 10 == requirednumber) {
				reminder = reminder + 1;
			}
			int generatedmiddigit = number / 10;
			if (generatedmiddigit > 0 && generatedmiddigit == requirednumber) {
				temp = temp + 1;
			}
			number++;
		} while (number < 100);

		System.out.println("Total number of " + requirednumber + "'s in the series below 100 :: " + (reminder + temp));
		System.out.println("Sum of number of " + requirednumber + "'s in the series below 100 :: "
				+ (reminder + temp) * requirednumber);
	}

}
