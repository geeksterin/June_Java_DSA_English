package dsa_13thOct_2022;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,4,8,10};
		int b[] = {5,6,13,16,19};
		
		int c[] = new int[a.length + b.length];
		
		int i = 0; //a array
		int j = 0; //b array
		
		int k = 0; // c array;
		
		while(i<a.length && j<b.length) {
			
			if(a[i] < b[j]) {
				c[k] = a[i];
				k++;
				i++;
			}
			else {
				c[k] = b[j];
				k++;
				j++;
			}
		}
		
		
		//left over elements in a array
		while(i<a.length) {
			c[k] = a[i];
			k++;
			i++;
		}
		
		//left over elements in a array

		while(j<b.length) {
			c[k] = b[j];
			k++;
			j++;
		}
		
		System.out.println(Arrays.toString(c));
		
	}

}
