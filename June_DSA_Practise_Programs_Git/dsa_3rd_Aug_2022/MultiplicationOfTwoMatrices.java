package dsa_3rd_Aug_2022;

public class MultiplicationOfTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 1, 2 , 3}, { 3, 4 , 5} };
		int b[][] = { { 3, 5, 5 }, { 7, 1, 7} ,{6,7, 8}};

		int m1 = a.length;
		int n1 = a[0].length;

		int m2 = b.length;
		int n2 = b[0].length;

		if (n1 == m2) {
			int c[][] = new int[m1][n2];

			for (int i = 0; i < m1; i++) {
				for (int j = 0; j < n2; j++) {
					for (int k = 0; k < m2; k++) {
						c[i][j] = c[i][j] + a[i][k] * b[k][j];
					}
				}
			}

			for (int i = 0; i < m1; i++) {
				for (int j = 0; j < n2; j++) {
					System.out.print(c[i][j]+"  ");
				}

				System.out.println();
			}
		}
		
		else {
			System.out.println("Matrix multiplication not possible ");
		}
	}
}
