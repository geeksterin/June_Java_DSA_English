package dsa_3rd_Oct_2022;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Queue<Integer> pq = new LinkedList<>();

		Queue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		pq.add(56);
		pq.add(87);
		pq.add(98);
		pq.add(13);
		
		//System.out.println(pq);
		
		//System.out.println(pq.peek());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());

	}

}
