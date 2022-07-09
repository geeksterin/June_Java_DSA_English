package dsa_9th_July_2022;

import java.util.Arrays;

public class NidhiCode {

	public static void main(String[] args) {

		int arr[] = { 1, 0, 0, 1, 0, 0, 1, 1 };
		// selectionSort(arr);
		int a[] = sortElement0And1(arr);
		System.out.print(Arrays.toString(arr));
	}

	public static int[] sortElement0And1(int arr[]) {
		int count0 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count0++;
			}
		}
		for (int j = 0; j < count0; j++) {
			arr[j] = 0; // System.out.print("0"+" ");
		}
		for (int k = count0; k < arr.length; k++) {
			arr[k] = 1;// System.out.print("1"+" ");
		}
		// System.out.print(Arrays.toString(arr));
		return arr;

	}

}
