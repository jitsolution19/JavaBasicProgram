package javaPracticeProgram;

public class ConvertNumberIntoDigit {

	public static void main(String[] args) {
		int[] arr = new int[15];
		int num = -56123450;
		if (num < 0) {
			num = num * (-1);
		}
		int i = 0;
		do {
			System.out.println("Digit of number is " + num % 10);
//			System.out.println("quotient is as " + num / 10);
			arr[i] = (num % 10);
			num = num / 10;
			i++;
		} while (num > 0);
	System.out.println("Size of the Array is as "+arr.length+" But the Digit Presnt are as "+(i));
	}
	
}
