package dsa_24th_June_2022;

import java.util.Scanner;

public class RakeshCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int rowStarter = 0;
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		for (int i = 0; i < row; i++) {
			rowStarter++;
			int colStarter = rowStarter;
			for (int j = 0; j < col; j++) {

				System.out.print(colStarter + " ");
				colStarter = colStarter + row;
			}
			System.out.println();
		}

	}

}
