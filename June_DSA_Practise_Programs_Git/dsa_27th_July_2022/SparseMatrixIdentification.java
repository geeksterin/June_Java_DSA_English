package dsa_27th_July_2022;

public class SparseMatrixIdentification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 0, 0, 0, 0 }, { 10, 1, 10, 0 }, { 10, 10, 1, 10 }, { 10, 0, 0, 0 } }; // more no. of zeroes. zero count >size/2
		
		int m = a.length;
		int n = a[0].length;
		
		int count = 0;
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j]==0) {
					count++;
				}
			}
		}
		
		if(count > (m*n)/2) {
			System.out.println("Sparse");
		}
		
		else {
			System.out.println("Non sparse");
		}
	}

}
