package dsa_20th_July_2022;

import java.util.Arrays;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {0,1,2,2,3,0,4,2};
		
		int b[] = {0,1,3,0,4,2,2,2};
		
		int val = 2;
		
		a = b;
		
		System.out.println(Arrays.toString(a));
		
		
		int count = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==val) {
				count = i;
				break;
			}
		}
		
		System.out.println(count);
		
	}

}
