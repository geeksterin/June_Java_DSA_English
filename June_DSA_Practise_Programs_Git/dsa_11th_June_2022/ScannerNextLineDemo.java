package dsa_11th_June_2022;

import java.util.Scanner;

public class ScannerNextLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc = new Scanner(System.in); String s = sc.nextLine();
		 * System.out.println("input eneterd : "+s);
		 */
		
	    Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}

}
