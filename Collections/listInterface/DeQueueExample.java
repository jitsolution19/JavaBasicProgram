package listInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class DeQueueExample {

	public static void main(String[] args) {
	
		Deque<Integer> dec = new ArrayDeque<>();
		dec.add(1);
		dec.add(3);
		dec.add(2);
				
		for(int value:dec)
		{
			System.out.println(value);
		}

		Queue<Integer> quu = new PriorityQueue<>();
		quu.add(2);
		quu.add(1);
		quu.add(3);
		for(int val:quu)
		{
			System.out.println(val);
		}
	
		System.out.println(quu.peek());
		quu.remove();
		System.out.println(quu.poll());
		
			
	
	}

}
