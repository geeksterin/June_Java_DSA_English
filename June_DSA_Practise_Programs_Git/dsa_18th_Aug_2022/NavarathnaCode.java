package dsa_18th_Aug_2022;

import java.util.Scanner;

public class NavarathnaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		float n = input.nextFloat();
		if (n % 1 == 0) {
			System.out.println(n);
		} else if (n > 0) {
			System.out.println(Math.round(n) + 1);
		} else if (n < 0) {
			System.out.println(Math.round(n) - 1);
		}
	}

}
