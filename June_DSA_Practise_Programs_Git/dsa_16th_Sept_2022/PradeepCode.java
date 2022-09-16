package dsa_16th_Sept_2022;

import java.util.Scanner;
import java.util.Stack;

public class PradeepCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Stack<Integer> st = new Stack<>();
		for (int i = 1; i <= T; i++) {
			st.push(sc.nextInt());
		}
		System.out.println(st.size());
	}
}
