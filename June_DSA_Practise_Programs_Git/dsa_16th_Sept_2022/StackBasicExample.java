package dsa_16th_Sept_2022;

import java.util.Scanner;
import java.util.Stack;

public class StackBasicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * First make a Stack. //done Then take T as an integer input. Then you will be
		 * given T integer inputs.
		 * 
		 * If you are given 1 : Then print the size of the stack in a separate line. If
		 * you are given 2: Then remove an element from the stack. 
		 * If the stack is empty then print -1 in a separate line. 
		 * If you are given 3: Then just after 3 you
		 * will be given another integer which you have to add to the stack. If you are
		 * given 4: Then you have to print an element at the top of the stack
		 */
		
		Stack<Integer> st = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0;i<T;i++) {
			st.push(sc.nextInt());
		}
		
		//size
		System.out.println(st.size());
		
		if(st.size()==0) {
			System.out.println(-1);
		}
		else {
			System.out.println(st.pop());
		}
		
	}

}
