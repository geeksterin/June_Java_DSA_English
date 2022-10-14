package dsa_14th_Oct_2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindUniqueFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		Map<Integer, Integer> mp1 = new HashMap<>();
		Set<Integer> st = new HashSet<>();

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (mp1.containsKey(a[i])) {
				mp1.put(a[i], mp1.get(a[i]) + 1);
			} else {
				mp1.put(a[i], 1);
			}

		}
		sc.close();

		for (int x : mp1.keySet()) {

			int val = mp1.get(x);
			st.add(val);

		}
		
		if(st.size() == mp1.size()) {
			System.out.println("true");
		}
		
		else {
			System.out.println("false");

		}

	}

}
