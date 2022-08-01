package dsa_1st_August_2022;

import java.util.Scanner;

public class PalindromicRowCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();

		int a[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = s.nextInt();
			}
		}

		int c = 0;
		for (int i = 0; i < m; i++) {
			boolean palindrome = true;

			int k = n - 1;
			int j = 0;
			while (j < k) {
				if (a[i][j] != a[i][k]) {
					palindrome = false;
				}

				j++;
				k--;
			}
			
			if(palindrome == true) {
				c++;
			}
		}

		System.out.print(c);
	}
}
