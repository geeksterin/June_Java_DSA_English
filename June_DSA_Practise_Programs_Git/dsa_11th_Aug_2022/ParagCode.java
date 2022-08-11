package dsa_11th_Aug_2022;

import java.util.Arrays;

public class ParagCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcde";
		String temp = "abcedi";
		boolean flag = true;
		if (s1.length() != temp.length()) {
			flag = false;

		} else {
			char c[] = s1.toCharArray();
			char c2[] = temp.toCharArray();
			Arrays.sort(c);
			Arrays.sort(c2);

			for (int i = 0; i < c.length; i++) {
				if (c[i] != (c2[i])) {
					flag = false;
					break;
				}

			}

		}
		System.out.println(flag);

	}

}
