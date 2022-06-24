package dsa_24th_June_2022;

import java.util.Scanner;

public class PrintTheSequenceAperRowSizeAndcolSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int rowSize = sc.nextInt();
		int colSize = sc.nextInt();
		
		int counter = 1;
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				System.out.print(counter++ +" ");
			}
			
			System.out.println();
		}

	}

}
