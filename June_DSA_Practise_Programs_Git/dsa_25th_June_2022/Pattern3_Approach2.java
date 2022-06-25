package dsa_25th_June_2022;

import java.util.Scanner;

public class Pattern3_Approach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int rowSize = sc.nextInt();
		int colSize = sc.nextInt();
		
		for(int i=0;i<rowSize;i++) { // 1,2,3,4,5
			for(int j=colSize-1;j>=0;j--) {// 4,3,2,1,0
				if(i==j) {
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
