package dsa_28th_June_2022;

import java.util.Scanner;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int rowSize1 = sc.nextInt();
		int colSize1 = 2 * rowSize1 - 1;

		pyramid(rowSize1, colSize1);

		int rowSize2 = rowSize1 - 1;
		int colSize2 = 2 * rowSize2 - 1;
		
		inversePyramid(rowSize2, colSize2);
	}

	private static void inversePyramid(int rowSize, int colSize) {

		for (int i = rowSize; i >= 1; i--) {
			for (int j = colSize; j >= 1; j--) {

				if (j >= rowSize - i + 1 && j <= rowSize + i - 1) {

					if (j == rowSize + i - 1) {
						System.out.print(" *");

					} else {
						System.out.print("*");
					}

					//System.out.print("*");
				}

				else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

	private static void pyramid(int rowSize, int colSize) {

		for (int i = 1; i <= rowSize; i++) {
			for (int j = 1; j <= colSize; j++) {

				if (j >= rowSize - i + 1 && j <= rowSize + i - 1) {
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
