package dsa_16th_Sept_2022;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		
		System.out.println(st.peek());
		
		System.out.println(st.pop());
		
		System.out.println(st.peek());
		
		//System.out.println(st.s);
		

	}

}
