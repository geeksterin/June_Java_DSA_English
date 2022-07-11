package dsa_11th_July_2022;

import java.util.Arrays;

public class Sort0and1ByUsingTwoPointerApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {0,1,0,1,1,0,1,0,1};
		
		int i = 0;
		int j = a.length-1;
		
		while(i<j) {
			
			//0 should be present at the ith position
			if(a[i]==0) {
				i++;
			}
			
			if(a[j]==1) {
				j--;
			}
			
			if(a[i]==1 && a[j]==0) {
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
