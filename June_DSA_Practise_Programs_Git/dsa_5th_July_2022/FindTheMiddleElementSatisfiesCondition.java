package dsa_5th_July_2022;

import java.util.Scanner;

public class FindTheMiddleElementSatisfiesCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		int mid = -1;
		
		if(a.length<2) {
			mid = -1;
			return;
		}
		
		if(a.length%2==0) {
			mid = a.length/2 -1;
		}
		
		else {
			mid = a.length/2;
		}
		
		if(a[mid]%2==0 && a[mid]>a.length) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		
		
	}

}
