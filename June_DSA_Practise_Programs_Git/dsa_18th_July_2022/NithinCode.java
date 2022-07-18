package dsa_18th_July_2022;

import java.util.Arrays;

public class NithinCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {28,-1,2,3,-2,-4,5};
		int n=a.length;
		int j=0;
		int b[]=new int[n];
		
		for(int i=0;i<n;i++) {
			if(a[i]>=0) {
				b[j]=a[i];
				j++;
			}
			
		}
		for(int i=0;i<n;i++) {
			if(a[i]<0) {
				b[j]=a[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(b));

	}

}
