package dsa_11th_July_2022;

import java.util.Arrays;

public class TwoPointerArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,3,4,6,7};
		
		int i = 0;
		int j = a.length-1;
		
		while(i<j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
			i++;
			j--;
		}
		
		
		System.out.println(Arrays.toString(a));
	}

}
