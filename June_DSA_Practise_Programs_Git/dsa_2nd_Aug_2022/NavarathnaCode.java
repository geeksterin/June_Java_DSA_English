package dsa_2nd_Aug_2022;

import java.util.Arrays;
import java.util.Scanner;

public class NavarathnaCode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int a[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = input.nextInt();
			}
		}
		if ((a[0][0] != a[0][n - 1])) {
			int temp = a[0][0];
			a[0][0] = a[0][n - 1];
			a[0][n - 1] = temp;
		}
		if ((a[n - 1][0] != a[n - 1][n - 1])) {
			int temp = a[n - 1][0];
			a[n - 1][0] = a[n - 1][n - 1];
			a[n - 1][n - 1] = temp;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
