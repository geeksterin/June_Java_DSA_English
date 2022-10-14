package dsa_14th_Oct_2022;

import java.io.*;
import java.util.*;

class FindAllPeakElementsInArray {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		sc.close();

		for (int i = 1; i < n - 1; i++) {
			if ((a[i - 1] < a[i]) && (a[i + 1] < a[i])) {
				System.out.print(a[i] + " ");
			}
		}
	}

}
