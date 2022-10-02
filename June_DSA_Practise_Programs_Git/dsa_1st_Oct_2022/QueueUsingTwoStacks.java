package dsa_1st_Oct_2022;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingTwoStacks {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		while (n > 0) {

			int ops = sc.nextInt();

			switch (ops) {
			case 1:
				// int x = sc.nextInt();
				st1.push(sc.nextInt());
				break;
			case 2:
				while (!(st1.isEmpty())) {
					st2.push(st1.pop());
				}
				st2.pop();
				while (!(st2.isEmpty())) {
					st1.push(st2.pop());
				}
				break;
			case 3:
				while (!(st1.isEmpty())) {
					st2.push(st1.pop());
				}
				System.out.println(st2.peek());
				while (!(st2.isEmpty())) {
					st1.push(st2.pop());
				}
				break;
			}
			n--;
		}

		sc.close();

	}
}