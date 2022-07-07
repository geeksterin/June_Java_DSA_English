package dsa_7th_July_2022;

import java.util.Arrays;

public class TestArrayReturnInAMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,2,10,9,0,0};
		int b[] = new int[10];
	
		b = a;
		System.out.println(Arrays.toString(b));
		
	}
}
