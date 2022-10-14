package dsa_13thOct_2022;

import java.util.Arrays;

public class MoveAllNegativeElementstoLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		
		int i = 0;
		int j = a.length -1;
		
		while(i<=j) {
			if(a[i]<0) {
				i++;
			}
			
			else if(a[j]>0) {
				j--;
			}
			
			else if(a[i]>0 && a[j]<0) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		
		
		System.out.println(Arrays.toString(a));
	}

}
