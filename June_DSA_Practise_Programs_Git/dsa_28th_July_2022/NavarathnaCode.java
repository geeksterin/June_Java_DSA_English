package dsa_28th_July_2022;

import java.util.Scanner;

public class NavarathnaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		/*
//		 * Scanner input=new Scanner(System.in); int n=input.nextInt(); int
//		 * m=input.nextInt(); int a[][]=new int [n][m]; for(int i=0;i<n;i++){ for(int
//		 * j=0;j<m;j++){ a[i][j]=input.nextInt(); } }
//		 */

		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 3, 4, 3, 8 }, { 6, 4, 9, 3 } };

		int m = a.length;
		int n = a[0].length;
		
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}

		
		System.out.println("------------");
		
		
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < m; j++) {
					System.out.print(a[i][j] + " ");
				}
			} else {
				for (int j = m - 1; j >= 0; j--) {
					System.out.print(a[j][i] + " ");
				}
			}
			System.out.println();
		}
	}

}
