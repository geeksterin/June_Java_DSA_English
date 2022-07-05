package dsa_5th_July_2022;

import java.util.Scanner;

public class RohitCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the size : ");
		int n = sc.nextInt();
		
		int a[] = new int[n];

		//System.out.println("Enter the elements : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		//System.out.println("Enter the target : ");
		int x = sc.nextInt();

		
		int index = -1;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				index = i;
				break;
			}
		}
		//System.out.println(index);

	}

}
