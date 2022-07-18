package dsa_18th_July_2022;

import java.util.Arrays;

public class DubeyCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// TODO Auto-generated method stub
			int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
			
			int index = 0;
			
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] > 0) {
					if(index != 0) {
						int temp = arr[index];
						arr[index] = arr[i];
						arr[i] = temp;
					}
					index++;
				}
				System.out.println(Arrays.toString(arr));
			}
			
			System.out.print(Arrays.toString(arr));
		}
	

}
