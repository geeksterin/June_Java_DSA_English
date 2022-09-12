package dsa_12th_Sep_2022;

import java.util.Arrays;
import java.util.Scanner;

public class charArrayMatrixDemo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int m = s.nextInt();

		int n = s.nextInt();

		s.nextLine();

		char c[][] = new char[m][n];

		for (int i = 0; i < m; i++) {
			for(int j=0;j<n;j++) {
				String s1 = s.nextLine();
				c[i][j] = s1.charAt(0);
			}
			
		}

		s.close();

		System.out.println(Arrays.deepToString(c));
	}

}
