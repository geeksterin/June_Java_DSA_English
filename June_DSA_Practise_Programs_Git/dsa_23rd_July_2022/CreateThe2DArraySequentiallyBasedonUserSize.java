package dsa_23rd_July_2022;

import java.util.Scanner;

public class CreateThe2DArraySequentiallyBasedonUserSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter row size : ");
		int rowSize = sc.nextInt();

		System.out.println("Please enter column size : ");
		int colSize = sc.nextInt();
		
		int a[][] = new int[rowSize][colSize];
		
		int c = 1;
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				a[i][j] = c++;
			}
			
		}
		
		
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
			
		}
		
	}

}
