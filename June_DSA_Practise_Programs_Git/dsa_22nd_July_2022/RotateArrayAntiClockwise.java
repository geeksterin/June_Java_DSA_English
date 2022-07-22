package dsa_22nd_July_2022;

import java.util.Arrays;

public class RotateArrayAntiClockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5};  // 2 3 4 5 1
		
		int temp = a[0];
		
		for(int i =0;i<a.length-1;i++) {
			a[i] = a[i+1];
		}
		
		a[a.length-1] = temp;
		System.out.println(Arrays.toString(a));

		
	}

}
