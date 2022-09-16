package dsa_16th_Sept_2022;

import java.util.Stack;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// convert to string
		// add the characters in the form of integers to stack
		// poping the integers, add to a temp string
		// convert temp string to integer
		
		
		int num = 4320;

		String s = num + "";
		System.out.println(s);

		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			st.push(s.charAt(i)-'0');
		}

		String temp = "";
		//boolean removeZero = true;
		for (int i = 0; i < s.length(); i++) {
			int p = st.pop();
			
			temp = temp + p;
		}

		System.out.println(temp);
		
		int res = Integer.parseInt(temp);
		System.out.println(res);

	}

}
