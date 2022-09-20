package dsa_20th_Sept_2022;

import java.util.Scanner;
import java.util.Stack;

public class PostFixEvaluationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isDigit(ch)) { // if(ch>='0' && ch<='9'){
				st.push(ch - '0');

			}

			else {

				if (st.size() > 1) {
					int n1 = st.pop();
					int n2 = st.pop();

					if (ch == '+') {
						st.push(n2 + n1);
					}

					if (ch == '-') {
						st.push(n2 - n1);

					}

					if (ch == '*') {
						st.push(n2 * n1);

					}

					if (ch == '/') {
						st.push(n2 / n1);

					}
				}
			}
		}

		if (st.isEmpty()) {
			System.out.println(0);

		} else {
			System.out.println(st.peek());

		}
	}
}
