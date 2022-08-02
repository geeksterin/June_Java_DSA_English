package dsa_2nd_Aug_2022;

import java.util.Arrays;
import java.util.Collections;

public class TransposeOfAMatrixInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int m = a.length;
		int n = a[0].length;
		
		for(int i=0;i<m;i++) {
			for(int j=i;j<n;j++) {
				
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
		
		
		
		for(int i =0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		//System.out.println(Arrays.deepToString(a));
		
	}

}
