package dsa_20th_Aug_2022;

import java.util.Scanner;

public class RotateTheNumberByThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int p1 = n%1000;
		int p2 = n/1000;
		
		int res = p1 * 10000 + p2;
		
		System.out.println(res);
	}

}
