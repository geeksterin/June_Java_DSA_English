package dsa_4th_Oct_2022;

import java.util.PriorityQueue;
import java.util.Scanner;

public class NidhisCode {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int op = sc.nextInt();
			if (op == 1) {
				System.out.println(pq.size());
			} else if (op == 2) {
				if (pq.size() == 0) {
					System.out.println(-1);
				} else {
					pq.poll();

				}
			} else if (op == 3) {
				int k = sc.nextInt();
				pq.add(k);
			} else if (op == 4) {

				if (pq.size() == 0) {
					System.out.println(-1);
				} else {
					System.out.println(pq.peek());

				}
			}
		}
	}
}
