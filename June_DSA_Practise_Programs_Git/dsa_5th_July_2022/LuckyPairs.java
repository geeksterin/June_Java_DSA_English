package dsa_5th_July_2022;

import java.util.Scanner;

public class LuckyPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<a.length;i++) {
			a[i] = s.nextInt();
					
		}
		
		int count =0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
		}
		
		System.out.println(count);
	}

}
