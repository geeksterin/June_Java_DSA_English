package dsa_2nd_July_2022;

import java.util.Scanner;

public class FindLargeElementInTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		//Read array elements from user
		for(int i =0;i<a.length;i++) {
			a[i] = sc.nextInt();
		}
		
		
		int large = a[0];
		int largeIndex = 0;
		
		for(int i=1;i<a.length;i++) {
			
			if(a[i]> large) {
				large = a[i];
				largeIndex = i;
			}
		}
		
		System.out.println("Large element : "+large);
		System.out.println("Large element index : "+largeIndex);

	}

}
