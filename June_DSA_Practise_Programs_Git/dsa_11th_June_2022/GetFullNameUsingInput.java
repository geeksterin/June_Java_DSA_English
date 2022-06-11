package dsa_11th_June_2022;

import java.util.Scanner;

public class GetFullNameUsingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter first name : ");
		
		String firstName = sc.next();
		
		System.out.println("Please enter last name : ");
		
		String lastName = sc.next();
		
	
		String fullName = firstName + " " + lastName;
		
		System.out.println(fullName);
		

		
	}

}
