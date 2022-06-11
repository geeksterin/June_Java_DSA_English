package dsa_11th_June_2022;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");

		int num = scan.nextInt();
		
		//System.out.println("Output data "+num);
		
		if(num%2==0) {
			System.out.println("even");
		}
		
		else {
			System.out.println("Odd");
		}
	}

}
