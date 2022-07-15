package dsa_15th_July_2022;

import java.util.Arrays;

public class AlternateNegativeandPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {-4, 1, -1, 2, 3, 4};
		
		int b[] = new int[a.length];
		
		
		int positiveIndex = 1;
		int negativeIndex = 0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<0) {
				b[negativeIndex] = a[i];
				negativeIndex=negativeIndex+2;
			}
			
			else {
				b[positiveIndex]=a[i];
				positiveIndex = positiveIndex+2;
			}
			
		}
		
		System.out.println(Arrays.toString(b));
	}

}
