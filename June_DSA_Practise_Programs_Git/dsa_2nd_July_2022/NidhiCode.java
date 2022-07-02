package dsa_2nd_July_2022;

import java.util.Scanner;

public class NidhiCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];
		int result = countElentIndexSameElement(arr);
		System.out.println(result);
		
		sc.close();

	}

	public static int countElentIndexSameElement(int arr[]) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		sc.close();
		for (int j = 0; j < arr.length; j++) {
			if (j == arr[j]) {
				count++;
			}
		}
		return count;
	}

}
