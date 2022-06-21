package dsa_21st_June_2022;

import java.util.Scanner;

public class TakeInputAndReadAndConcatenateNTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		
		int i =1;
		
		String s = "Welcome to ";
		while(i<=n) {
			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			
			s = s + name + " ";
			
			i++;
		}
		
		System.out.println(s);

	}

}
