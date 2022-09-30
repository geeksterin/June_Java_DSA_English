package dsa_30thSept_2022;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemoUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(24);
		
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.remove());
		System.out.println(q);
		
		System.out.println(q.isEmpty());
		System.out.println(q.size());
		
	}

}
