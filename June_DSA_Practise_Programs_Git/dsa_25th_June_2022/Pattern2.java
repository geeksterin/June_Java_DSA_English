package dsa_25th_June_2022;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int rowSize = sc.nextInt();
		int colSize = sc.nextInt();

		//int n =1;
		for(int i=1;i<=rowSize;i++) {
			for(int j=1;j<=colSize;j++) {
				if(i==j) {
					System.out.print(i);
				}
				
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
