package dsa_4th_July_2022;

import java.util.Scanner;

public class ScannerIntAndStringinOneLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		try {
			int a1 = Integer.parseInt(s1);
			int a2 = Integer.parseInt(s2);
			
			System.out.println(a1+a2);
			
		}
		catch(Exception e) {
			System.out.println(s1+s2);
		}
		
	}

}
