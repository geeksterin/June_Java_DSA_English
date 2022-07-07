package dsa_7th_July_2022;

import java.util.Arrays;

public class SwapFirstAndLastElementOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,5};
		
		System.out.println(a[a.length-1]);
		
		
		if(a.length>=2) {
			int temp = a[0];
			a[0] = a[a.length-1];
			a[a.length-1] = temp;
			System.out.println(Arrays.toString(a));
			
			

		}
		
	}

}
