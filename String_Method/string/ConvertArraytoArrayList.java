package javaPracticeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertArraytoArrayList {

	public static void main(String[] args) {
	int[] arr = {1,2,3,45,67,44,32,6};
	List<Integer> temp = Arrays.stream(arr).boxed().collect(Collectors.toList());
//	List<int[]> list = Arrays.asList(arr);
	ArrayList<Integer>arrlist = new ArrayList<Integer>();
	arrlist.addAll(temp);
//	Collections.addAll(arrlist, null)
	Collections.sort(arrlist);
	for(Integer counter:arrlist) {
		System.out.println(counter);
	}
	}

}
