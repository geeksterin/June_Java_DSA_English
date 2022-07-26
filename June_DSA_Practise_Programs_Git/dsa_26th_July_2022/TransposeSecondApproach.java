package dsa_26th_July_2022;

public class TransposeSecondApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 2, 4 }, { 5, 6 }, { 10, 20 } };

		int m1 = a.length; // rowsize
		int n1 = a[0].length; // colsize

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < m1; j++) {

				System.out.print(a[j][i] + " ");
			}

			System.out.println();
		}

	}
}
