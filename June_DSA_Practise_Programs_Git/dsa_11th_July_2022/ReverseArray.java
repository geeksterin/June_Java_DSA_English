package dsa_11th_July_2022;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,5,1,4,7};  // a [] = {7,4,1,5,2}
		
		int b[] = new int [a.length];
		
		int j =0;
		for(int i=a.length-1;i>=0;i--) {
			b[j]= a[i];
			j++;
		}
		
		a = b;
		System.out.println(Arrays.toString(a));

	}

}
