package dsa_4th_Oct_2022;

import java.util.Arrays;

public class MinimumSumofTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 6, 8, 4, 5, 2, 3 };

		Arrays.sort(a);
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				s2 = s2 + a[i];
			} else {
				s1 = s1 + a[i];
			}
		}
		
		System.out.println(s1);
		System.out.println(s2);
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);

		System.out.println(n1+n2);

	}

}
