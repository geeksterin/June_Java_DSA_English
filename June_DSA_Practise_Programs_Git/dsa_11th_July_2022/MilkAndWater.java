package dsa_11th_July_2022;

import java.util.Arrays;

public class MilkAndWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {-5 ,-3, 4 ,8 ,-11, 6, -4, 5 ,17 ,7,0};
		
		//-5 -3 4 8 -11 6 -4 5 17 7
		
		//-5 -3 -11 -4 4 8 6 5 17 7 
		
		//[-5, -3, -4, -11, 8, 6, 4, 5, 17, 7, 0]


		int i = 0;
		int j = a.length-1;
		
		while(i<j) {
			if(a[i]<0) {
				i++;
			}
			
			if(a[j]>=0) {
				j--;
			}
			
			if(a[i]>=0 && a[j]<0) {
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
