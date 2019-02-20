package oopsLearning;

public class ObjectMultipleValue {

	public static void main(String[] args) {
		Object [] abc = (Object[]) new Object();
		abc[0]=45;
		abc[1]="Jitendra";
		abc[2]="Gupta";
		System.out.println(abc[1]);
	}
}
