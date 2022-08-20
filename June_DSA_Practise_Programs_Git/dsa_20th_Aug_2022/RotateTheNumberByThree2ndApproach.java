package dsa_20th_Aug_2022;

import java.util.Scanner;

public class RotateTheNumberByThree2ndApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String s1 = n + "";
		
		String p1 = s1.substring(4, 7);
		String p2 = s1.substring(0, 4);
		
		String res = p1 + p2;
		int val = Integer.parseInt(res);
		
		System.out.println(val);
		
	}

}
