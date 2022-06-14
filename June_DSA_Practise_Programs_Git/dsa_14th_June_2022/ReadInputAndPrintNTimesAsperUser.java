package dsa_14th_June_2022;

import java.util.Scanner;

public class ReadInputAndPrintNTimesAsperUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of times the message to be printed : ");
		int count = scan.nextInt();
		
		scan.nextLine();
		System.out.println("Enter the message : ");
		String msg = scan.nextLine();
		
		for(int i =0;i<count;i++) {
			System.out.println(i+" :: "+msg);
		}

		
	}

}
