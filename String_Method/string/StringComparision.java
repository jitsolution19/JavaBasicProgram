package string;

public class StringComparision {

	public static void main(String[] args) {

		String a = "Jitendra";
		String b = "Jitendra";
		System.out.println(a==b); // output :: true
		System.out.println(a.equals(b)); //output :: true
		System.out.println(a.compareTo(b));  //output :: 0
		System.out.println(a.compareToIgnoreCase(b)); //output :: 0

		StringBuffer c= new StringBuffer("Jitendra");
		StringBuffer d= new StringBuffer("Jitendra");		
		System.out.println(c==d); //OutPut :: False
		System.out.println(c.equals(d)); //OutPut :: False
		c=c.append("Gupta");
		System.out.println(c);
		
		StringBuilder p= new StringBuilder("Jitendra");
		StringBuilder q= new StringBuilder("Jitendra");
		System.out.println(p==q); //OutPut :: False
		System.out.println(p.equals(q)); //OutPut :: False
	}

}
