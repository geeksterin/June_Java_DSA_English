package dsa_28th_July_2022;

public class SwapAnyTwoGivenRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 3, 4, 3, 8 }, { 6, 4, 9, 3 } };

		int m = a.length;
		int n = a[0].length;
		
		
		int r1 = 1;
		int r2 = 3;
		
		for(int j=0;j<n;j++) {
			int temp = a[r1][j];
			a[r1][j] = a[r2][j];
			a[r2][j] = temp;
		}

		
		for(int i =0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
	}

}
