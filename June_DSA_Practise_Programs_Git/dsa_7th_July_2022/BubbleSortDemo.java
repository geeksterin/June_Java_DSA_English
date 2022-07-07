package dsa_7th_July_2022;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,3,2,1};  
		
		for(int i=0;i<a.length-1;i++) {
			System.out.println("------------------");
			System.out.println("Pass -> "+(i+1));
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					//swap
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
				
				
				System.out.println(Arrays.toString(a));

			}
		}
		
		System.out.println();
		System.out.println("----END RESULT ----");
		System.out.println(Arrays.toString(a));
	}

}
