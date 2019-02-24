package string;

public class String_Palindrome {

	public static void main(String[] args) {

		String Value = "Jeetendra";
		System.out.println(palindromeCheck(Value));
		String val = "a";
		System.out.println(val.charAt(0));

	}

	private static boolean palindromeCheck(String value) {
		if (value == null)
			return false;
		StringBuffer temp = new StringBuffer(value);
		temp.reverse();

		return temp.toString().equals(value);
	}

}
