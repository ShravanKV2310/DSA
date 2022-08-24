package p1;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		System.out.println(q);
		q.remove();
		System.out.println("Peek item ->"+q.peek());
		
		System.out.println("Size of Queue->"+q.size());
		if (q.isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			System.out.println("Queue is not empty");
		}
		
		long endTime   = System.currentTimeMillis();
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
	}
}
