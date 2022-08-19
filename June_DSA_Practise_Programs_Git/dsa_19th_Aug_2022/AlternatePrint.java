package dsa_19th_Aug_2022;

import java.util.Scanner;

public class AlternatePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		/*
		 * for (int i = 0; i < a.length; i = i + 2) { System.out.println(a[i]); }
		 */
		
		for (int i = 0; i < a.length; i++) {
				System.out.println(a[i]);
		}

	}

}
