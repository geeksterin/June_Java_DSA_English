package dsa_5th_July_2022;

import java.util.Scanner;

public class FindContinuosSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
			System.out.print(sum + " ");
		}
	}

}
