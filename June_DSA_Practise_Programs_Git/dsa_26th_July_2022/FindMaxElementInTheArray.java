package dsa_26th_July_2022;

public class FindMaxElementInTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 2, 4 }, { 5, 6 }, { 10, 20 } };

		int m1 = a.length; // rowsize
		int n1 = a[0].length; // colsize

		for (int j = 0; j < n1; j++) {

			int max = a[0][j];
			for (int i = 0; i < m1; i++) {
				if (a[i][j] > max) {
					max = a[i][j];
				}
			}

			System.out.println(max);
		}

	}

}
