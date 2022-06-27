package dsa_27th_June_2022;

import java.util.Scanner;

public class HackerRankPattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int rowSize = sc.nextInt();
		int colSize = sc.nextInt();
		
		for(int i=1;i<=rowSize;i++) {
			for(int j=1;j<=colSize;j++) {
				
				if(j>=i) {
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
