package dsa_22nd_june_2022;

import java.util.Scanner;

public class PrintReverseOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		while(num>0) {
			int digit = num%10;
			System.out.print(digit+"");
			num = num/10;
		}
	}

}
