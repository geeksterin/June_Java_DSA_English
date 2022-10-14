package dsa_14th_Oct_2022;

import java.util.HashMap;
import java.util.Map;

public class FindFirstUniqueCharacterInString {

	public static void main(String args[]) {
		int x = firstUniqChar("leetcode");
		System.out.println(x);

	}

	public static int firstUniqChar(String s) {

		// int val = -1;

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (map.containsKey(ch)) {
				int c = map.get(ch);
				map.put(ch, c + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.get(ch) == 1) {
				return i;
			}

		}

		return -1;
	}
}
