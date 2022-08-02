package dsa_2nd_Aug_2022;

import java.util.Arrays;

public class SwapThePrimaryAndDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int m = a.length;
		int n = a[0].length;
		
		
		
		
		for(int i =0;i<m;i++) {
			
			int pi = -1;
			int pj = -1;
			
			int si = -1;
			int sj = -1;
			
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.print("pd -> "+a[i][j]+" ");
					
					pi = i;
					pj = j;
				}
				
				if(i+j==n-1) {
					System.out.print("sd -> "+a[i][j]+" ");
					
					si = i;
					sj = j;
				}
			}
			
			//swap pd and sd
			int temp = a[pi][pj];
			a[pi][pj] = a[si][sj];
			a[si][sj] = temp;
			
			System.out.println();
		}
		
		
		System.out.println(Arrays.deepToString(a));
		

	}

}
