package dsa_30th_July_2022;

public class TransposeOfAMatrixInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int rowSize = a.length;
		int colSize = a[0].length;
		
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------");

		for (int i = 0; i < rowSize; i++) {
			for (int j = i; j < colSize; j++) {
				
				//System.out.println("a[i][j] --> "+a[i][j]);
				
			//	System.out.println("a[j][i] --> "+a[j][i]);

				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
				
				
				
			}
		}
		
		
		System.out.println("----Transpose ----");
		
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
