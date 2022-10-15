package dsa_15th_Oct_2022;

import java.util.HashSet;
import java.util.Set;

public class SubStringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "madamer";
		s1 = s1.toLowerCase();
		int count = 0;

		String sstg = "";

		int maxLength = 0;
		for (int i = 0; i < s1.length(); i++) {
			for (int j = i; j < s1.length(); j++) {
				String str = s1.substring(i, j + 1);
				// System.out.println(str);
				if (hasDuplicates(str)==false) {
					//System.out.println(hasDuplicates(str));
					// System.out.println(str);
					int len = str.length();
					// System.out.println("len -> "+len);

					if (len > maxLength) {
						maxLength = len;
						sstg = str;
					}
				}
			}
		}

		// System.out.println(count);
		System.out.println(maxLength);
		System.out.println(sstg);
	}

	public static boolean hasDuplicates(String k) {

		Set<Character> st = new HashSet<>();
		for (int i = 0; i < k.length(); i++) {
			char ch = k.charAt(i);
			st.add(ch);
		}
		
		if(st.size()==k.length()) {
			return false;
		}
		
		else {
			return true;
		}
	}

}
