package dsa_4th_July_2022;

import java.util.Scanner;

public class CheckIfArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		boolean isSorted = false;

		for (int i = 0; i < a.length - 1; i++) {
			if ((a[i + 1] >=a[i])) {
				isSorted = true;
			}
			else {
				isSorted = false;
				break;
			}
			

		}

		if (isSorted == false) {
			System.out.println("No");
		}

		else {
			System.out.println("Yes");

		}

	}

}
