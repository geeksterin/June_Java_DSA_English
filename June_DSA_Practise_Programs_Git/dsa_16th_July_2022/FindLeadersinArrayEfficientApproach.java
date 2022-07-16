package dsa_16th_July_2022;

import java.util.Arrays;

public class FindLeadersinArrayEfficientApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {16,17,4,3,5,2};
		
		int max = a[a.length-1];

		int b[] = new int[a.length];
		
		b[0] = a[a.length-1];
		int c = 1;
		
		for(int i =a.length-2;i>=0;i--) {
			if(a[i]>max) {
				b[c] = a[i];
				max = a[i];
				c++;
			}
		}
		
		System.out.println(Arrays.toString(b));
		
		b = Arrays.copyOf(b, c);
		
		System.out.println(Arrays.toString(b));

		
		for(int k=b.length-1;k>=0;k--) {
				System.out.println(b[k]);
		}
		
		
	}

}
