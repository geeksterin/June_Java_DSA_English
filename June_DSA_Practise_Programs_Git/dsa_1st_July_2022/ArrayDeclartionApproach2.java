package dsa_1st_July_2022;

import java.util.Scanner;

public class ArrayDeclartionApproach2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();

		int a[] = new int[n];

		System.out.println("Enter array elements : ");

		

		for (int i = 0; i < a.length; i++) { // 0 to 4
			a[i] = sc.nextInt(); // a[0] = 10, a[1] = 20;, a[2] = 34 a[3] = 98 a[4] = 100
		}

		/*
		 * for (int i = 0; i < a.length; i++) { a[i] = sc.nextInt(); }
		 */

		/*
		 * System.out.println("Values enetered by user is : "); for (int i = 0; i <
		 * a.length; i++) { System.out.println(a[i]); }
		 */
		
		
		//sc.close();

	}

}
