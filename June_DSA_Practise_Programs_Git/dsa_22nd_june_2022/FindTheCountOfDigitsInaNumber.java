package dsa_22nd_june_2022;

import java.util.Scanner;

public class FindTheCountOfDigitsInaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int c = 0;

		if(num==0) {
			c = 1;
		}
		while(num>0) {
			c++;
			num = num/10;
		}
		
		System.out.println("Number of Digits : "+c);
	}

}
