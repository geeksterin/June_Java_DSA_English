package dsa_6th_Aug_2022;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		
		String s2 = "";
		
		for(int i =s1.length()-1;i>=0;i--) {
			s2 = s2 + s1.charAt(i);
		}
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");

		}
		
	}

}
