package dsa_17th_Sept_2022;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumberHackerrank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int num = sc.nextInt();

			int rev = getReverse(num);
			System.out.println(rev);
		}
	}

	static int getReverse(int num) {

		Stack<Integer> st = new Stack<>();

		String s = num + "";

		for (int i = 0; i < s.length(); i++) {
			int n = s.charAt(i) - '0';
			st.push(n);
		}

		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			temp = temp + st.pop();
		}

		int rev = Integer.parseInt(temp);
		return rev;
	}

}
