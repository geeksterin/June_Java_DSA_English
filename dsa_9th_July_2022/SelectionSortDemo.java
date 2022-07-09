package dsa_9th_July_2022;

import java.util.Arrays;

public class SelectionSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 12, 17, 10, 13, 16 }; // [1, 2, 4, 10] -> sorted -. 1 unsorted -> 2 4 10

		for (int i = 0; i < a.length-1; i++) { // No of passes // 0,1 and 2
			
			System.out.println("No. of pass : "+(i+1));
			int minInd = i; // 1

			// finding the minimum index
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minInd]) {
					minInd = j; // 3 (a[3] -> 1)
				}

			}
			int temp = a[i];
			a[i] = a[minInd];
			a[minInd] = temp;
			// Swap the element in the minIndexposition with the element in i

			System.out.println("Minimum element found at index : "+minInd);
			System.out.println("Swapping the elements at ith position : "+i+" with minIndex Position : "+minInd);
			System.out.println(Arrays.toString(a));
			System.out.println();
		}

		System.out.println("Final output :: ");
		System.out.println(Arrays.toString(a));
	}
}
