package dsa_22nd_July_2022;

import java.util.Scanner;

public class TwoDArrayUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter row size : ");
		int rowSize = s.nextInt();
		
		System.out.println("Enter col size : ");
		int colSize = s.nextInt();
		
		int a[][] = new int[rowSize][colSize];
		
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				a[i][j] = s.nextInt();
			}
		}
		
		s.close();
		
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}

}
