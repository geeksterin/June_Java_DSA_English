package dsa_16th_June_2022;

import java.util.Scanner;

public class FindSumOfAllOddNumbersTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 1) {
				sum = sum + i;

			}
		}

		/*
		 * for (int i = 1; i <= n; i = i + 2) { sum = sum + i; }
		 */

		System.out.println(sum);

	}

}
