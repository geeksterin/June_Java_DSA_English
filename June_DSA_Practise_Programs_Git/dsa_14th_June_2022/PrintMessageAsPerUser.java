package dsa_14th_June_2022;

import java.util.Scanner;

public class PrintMessageAsPerUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
	
		sc.nextLine();
		String msg = sc.nextLine();
		
		
		for(int i=0;i<count;i++) {
			System.out.println(msg);
		}
		
	}

}
