package dsa_28th_July_2022;

public class ColumnWave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 3, 4, 3, 8 }, { 6, 4, 9, 3 } };

		int m = a.length;
		int n = a[0].length;

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println("---------------");
		
		
		
		for (int j = 0; j < n; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < m; i++) {
					System.out.print(a[i][j] + " ");
				}

			}

			else {
				for (int i = n - 1; i >= 0; i--) {
					System.out.print(a[i][j] + " ");

				}
			}

			System.out.println();

		}

	}

}
