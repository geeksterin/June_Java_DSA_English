package dsa_2nd_Aug_2022;

import java.util.Arrays;

public class RotateMatrixClockwise90Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[][] a = { { 1, 2, 3, 7, 8 }, { 4, 5, 6, 8, 9 }, { 7, 8, 9, 8, 9 }, { 1, 0, 6, 8, 9 }, { 6, 5, 6, 8, 1 } };

		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		int m = a.length;
		int n = a[0].length;

		System.out.println("Original Array : ");
		System.out.println(Arrays.deepToString(a));

		for (int i = 0; i < m; i++) {
			for (int j = i; j < n; j++) {

				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}

		System.out.println();

		System.out.println("Transposed Array : ");
		System.out.println(Arrays.deepToString(a));

		System.out.println();

		for (int i = 0; i < m; i++) {
			int j = 0;
			int k = n - 1;
			while (j < k) {

				// Swap a[i][j] && a[i][k]

				int temp = a[i][j];
				a[i][j] = a[i][k];
				a[i][k] = temp;

				j++;
				k--;
			}

		}

		System.out.println("Clockwise rotated by 90 degree Array : ");
		System.out.println(Arrays.deepToString(a));

	}

}
