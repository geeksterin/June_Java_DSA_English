package dsa_26th_July_2022;

public class PrintPrimaryDiagonalElementssecondApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 2, 4, 5 }, { 5, 6, 1 }, { 10, 20, 7 } };

		int m = a.length; // rowsize
		int n = a[0].length; // colsize

		int prod = 1;

		for (int i = 0; i < m; i++) {

			// System.out.println(a[i][j] + " ");

			prod = prod * a[i][i];
		}

		System.out.println(prod);
	}

}
