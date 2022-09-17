package dsa_17th_Sept_2022;

import java.util.Scanner;
import java.util.Stack;

public class RemoveDuplicatesInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		Stack<Integer> st = new Stack<>();
		
		for(int i=0;i<size;i++) {
			
			int n = sc.nextInt();
			
			if(st.isEmpty()==false && st.peek()==n) {
				continue;
			}
			else {
				st.push(n);
			}
		}
		
		System.out.println(st);
		
	}

}
