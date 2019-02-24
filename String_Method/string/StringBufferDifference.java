package string;

public class StringBufferDifference {

	public static void main(String[] args) {
		String demo = "Jitendra";
		System.out.println(demo);

		StringBuffer demo1 = new StringBuffer("Gupta");
		System.out.println(demo1);
		demo1 = new StringBuffer("Akansha");
		System.out.println(demo1);		
		System.out.println(demo.intern());
		System.out.println(demo.compareTo("JEETENDRA"));
		System.out.println(demo.concat("Gupta"));
		System.out.println(demo.contains("ee"));
		System.out.println(demo1.codePointBefore(2));
		System.out.println(demo1.append(demo, 0, 5));

	}

}
