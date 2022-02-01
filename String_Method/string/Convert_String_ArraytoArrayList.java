package javaPracticeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Convert_String_ArraytoArrayList {

	public static void main(String[] args) {

		String[] arr = { "Jeetendra","Jitendra", "Gupta", "Raj", "Shivasnh", "Rohit" };
		ArrayList<String> arrlist = new ArrayList<>();
		arrlist.addAll(Arrays.asList(arr));
		Collections.sort(arrlist);
		for (String counter : arrlist) {
			System.out.println(counter);
		}
	}

}

