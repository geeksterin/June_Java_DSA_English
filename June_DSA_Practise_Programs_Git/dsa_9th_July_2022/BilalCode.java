package dsa_9th_July_2022;

import java.util.Scanner;

public class BilalCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int i, j;

		System.out.println("Enter the N");
		int n = scan.nextInt();

		System.out.println("Enter the Elements");
		int a[] = new int[n];

		for (i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		int temp = 0, min;
		
		
		for (i = 0; i < a.length - 1; i++) {
			min = i;
			for (j = i + 1; j < a.length; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;

		}
		System.out.println("After Shorting");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
