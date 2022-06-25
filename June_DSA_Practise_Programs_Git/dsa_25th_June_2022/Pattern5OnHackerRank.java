package dsa_25th_June_2022;

import java.util.Scanner;

public class Pattern5OnHackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rowSize = sc.nextInt();
		int colSize = sc.nextInt();
		
		for(int i=1;i<=rowSize;i++) {
			for(int j=5;j>=1;j--) {
				if(j<=i) {
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
