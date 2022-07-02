package dsa_2nd_July_2022;

import java.util.Scanner;

public class FindSmallerElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
		}
		
		s.close();
		
		int small = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i] < small) {
				small = a[i];
			}
		}
		
		System.out.println(small);
	}

}
