package dsa_11th_June_2022;

import java.util.Scanner;

public class CheckCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		
		char c = s.charAt(0);
		
		int ascii = c;
		
		if(c>=65 && c<=90) {
			System.out.println("Uppercase");
		}
		
		else {
			System.out.println("Lowercase");
			
		}
		
	
		
		
	}

}
