package dsa_2nd_Oct_2022;

import java.util.Scanner;

public class BruteForceFirstNegativeInteger {

	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int k = s.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {

			arr[i] = s.nextInt();

		}

		for (int i = 0; i < n - k + 1; i++) {
			boolean flag = false;
			for (int j = i; j < i + k; j++) {
				if (arr[j] < 0) {
					System.out.print(arr[j] + " ");
					flag = true;
					break;
				}
			}

			if (flag == false) {
				System.out.print(0 + " ");
			}
		}

	}
}
