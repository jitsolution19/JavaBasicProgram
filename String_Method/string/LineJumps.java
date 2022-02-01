package javaPracticeProgram;

public class LineJumps {
	public static void main(String args[]) {
		System.out.println(kangaroo(0, 3, 4, 2));
	}

	public static String kangaroo(int x1, int x2, int v1, int v2) {
		String value = "No";
		int k1 = x1, k2 = x2;
		for (int i = 1; i < 1000; i++) {
			k1 = k1 + v1;
			k2 = k2 + v2;
			if (k1 == k2) {
				value = "Yes";
				break;
			}
		}
		return value;
	}
}
