package dsa_1st_Oct_2022;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PrintBinaryUsingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int N = 10;
		
		Queue<String> q = new LinkedList<>();
		
		q.add("1");
		
		for(int i=0;i<N;i++) {
			String s = q.peek();
			
			System.out.print(s+" ");
			
			q.remove();
			q.add(s+"0");
			q.add(s+"1");
		}
		
		System.out.println();
		
		//System.out.println("queue :: "+q);
		
	}

}
