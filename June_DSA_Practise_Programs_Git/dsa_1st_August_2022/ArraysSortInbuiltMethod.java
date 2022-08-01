package dsa_1st_August_2022;

import java.util.Arrays;

public class ArraysSortInbuiltMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] =  {1,4,0,3,6};
		
		//Arrays.sort(a);
		
		
		Arrays.sort(a, 0, 3);
		
		System.out.println(Arrays.toString(a));
		
		
		char b[] = {'l','o','a','t','h'};
		
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(b));
		
	}

}
