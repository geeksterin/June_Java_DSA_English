package dsa_2nd_Aug_2022;

import java.util.Arrays;
import java.util.Scanner;

public class MilindCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int a[][] = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();

		if (m == n) {
			int r[] = new int[m];
			int c[] = new int[n];
			for (int i = 0, b = n - 1, count = 0; i < n; i++, b--, count++) {
				r[count] = a[i][i];
				c[count] = a[b][i];
			}
			System.out.println(Arrays.toString(r));
			System.out.println(Arrays.toString(c));
		}
		
		
		System.out.println(Arrays.deepToString(a));

	}

}
