package dsa_23_Sep_2022;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SameNumberSameFrequency {

	public static void main(String[] args) {
	

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			if (map.containsKey(a[i])) {
				int curr = map.get(a[i]);
				map.put(a[i], curr + 1);
			}

			else {
				map.put(a[i], 1);
			}
		}

		// System.out.println(map);

		int temp[] = new int[map.size()];
		int j = 0;
		for (int key : map.keySet()) {
			int val = map.get(key);
			int keyAbs = Math.abs(key);

			if (val == keyAbs) {
				// System.out.println(key);
				temp[j++] = key;
			}
		}

		// System.out.println(Arrays.toString(temp));

		Arrays.sort(temp); // 4 -3 0 0 0

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != 0) {
				System.out.println(temp[i]);
			}
		}
	}
}