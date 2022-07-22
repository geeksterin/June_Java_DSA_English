package dsa_22nd_July_2022;

import java.util.Arrays;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{1,2,3},{6,4,3},{0,1,3}};
				
		int rowSize = a.length;
		int colSize = a[0].length;
		
		//every row
		for(int i=0;i<rowSize;i++) {
			
			//for every column
			for(int j =0;j<colSize;j++) {
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
	}

}
