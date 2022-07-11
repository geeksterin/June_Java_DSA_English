package dsa_11th_July_2022;

import java.util.Arrays;

public class ReverseArrayInTwoPointersApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,5,1,4,7};  //a.length/2
		
		int i = 0;
		int j = a.length-1;
		
		while(i<j)
		{
			System.out.println("i --> "+i);
			System.out.println("j --> "+j);
			System.out.println("Swap these elements ");
			System.out.println("a["+i+"] --> "+a[i]);
			System.out.println("a["+j+"] --> "+a[j]);

			System.out.println(Arrays.toString(a));

			//swap
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			
			i++;
			j--;
			
			System.out.println(Arrays.toString(a));
			System.out.println("-----------------");
			

		}
		

		/*
		 * for(int k =0;k<a.length;k++) { System.out.println(a[k]); }
		 */
	}

}
