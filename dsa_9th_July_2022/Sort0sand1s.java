package dsa_9th_July_2022;

import java.util.Arrays;

public class Sort0sand1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {0,0,0,1,0,1,0,0};
		
		int zeroCount = 0;
		for(int i =0;i<a.length;i++) {
			if(a[i] == 0) {
				zeroCount++;
			}
		}
		
		
		for(int i=0;i<a.length;i++) {
			if(i<zeroCount) {
				a[i] = 0;
			}
			else {
				a[i] = 1;
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
