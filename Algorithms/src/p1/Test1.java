package p1;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Test1 {
	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<Integer>();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.add(5);
		List<Integer> list = q1.stream().sorted(Comparator.reverseOrder()).toList();
		Queue<Integer> q2 = new LinkedList<Integer>();
		q2.addAll(list);
		System.out.println(q1);
		System.out.println(q2);
		Stack<Integer> s = new Stack<Integer>();
		s.addAll(q2);
		System.out.println(s);
	}
}
