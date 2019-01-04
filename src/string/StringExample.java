package string;

public class StringExample {

	public static void main(String[] args) {

		String str1 = "value1";
		str1.concat("valu2");
		System.out.println(str1 + " //This indicate that the object of the srting value hold the existing value");

		// String value are stored in heap memory

		StringBuffer str2 = new StringBuffer("value1");
		String str3 = "Value2";

		for (int i = 0; i < 1000; i++) {
			System.out.println(str2.append(str3));
		}
//		System.out.println("Final value :: "+str3);
	}

}
