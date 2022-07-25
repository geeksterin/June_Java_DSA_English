package dsa_25th_July_2022;

public class TransposeOfAMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 2, 4 }, { 5, 6 }, { 10, 20 } };

		int m1 = a.length;
		int n1 = a[0].length;

		for (int j = 0; j < n1; j++) {
			for (int i = 0; i < m1; i++) {

				System.out.print(a[i][j]+" ");
			}

			System.out.println();
		}

	}
}
