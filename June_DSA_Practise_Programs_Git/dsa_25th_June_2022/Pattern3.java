package dsa_25th_June_2022;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int rowSize = sc.nextInt();
		int colSize = sc.nextInt();
		
		for(int i=0;i<rowSize;i++) {
			for(int j =0;j<colSize;j++) {
				if(j==colSize-i-1) {
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
