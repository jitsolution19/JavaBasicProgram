package javaPracticeProgram;

public class LineJumpInAnyDirection {

	public static int timecal(int a, int b, int c, int d) {
		int k1 = a, k2 = a;
		int p1 = b, p2 = b;
		int result = 0;
		for (int i = 0; i < 1000; i++) {
			k1 = k1 + c;
			k2 = k2 - c;
			p1 = p1 + d;
			p2 = p2 - d;
			System.out.println("k1= " + k1 + "   k2= " + k2 + "   p1= " + p1 + "   p2= " + p2);
			if (k1 == p1 || k1 == p2 || k2 == p1 || k2 == p2) {
				result = i;
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(timecal(2, 6, 4, 5));
	}

}
