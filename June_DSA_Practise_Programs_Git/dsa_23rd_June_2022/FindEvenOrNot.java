package dsa_23rd_June_2022;

import java.util.Scanner;

public class FindEvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// read input
		// find if even or odd

		int num = readInput();

		checkEven(num);
	}

	static int readInput() {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		return a;
	}

	static void checkEven(int b) {
		if (b % 2 == 0) {
			System.out.println("even");
		}

		else {
			System.out.println("Odd");
		}
	}

}
