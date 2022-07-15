package dsa_15th_July_2022;

import java.util.Arrays;

public class MilkAndWaterProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {-5,-3,4,8,-11, 6, -4, 5, 17, 7};
		
		int b[] = new int[a.length];
		
		int j =0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<0) {
				b[j] = a[i];
				j++;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>0) {
				b[j] = a[i];
				j++;
			}
		}
		
		System.out.println(Arrays.toString(b));
		
		a= b;
		
		System.out.println(Arrays.toString(a));

		
	}

}
