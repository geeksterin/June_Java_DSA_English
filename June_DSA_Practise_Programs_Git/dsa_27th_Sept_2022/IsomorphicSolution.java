package dsa_27th_Sept_2022;

import java.util.HashMap;

class IsomorphicSolution {

	public static void main(String args[]) {
		String s = "ab";
		String t = "ab";
		System.out.println(isIsomorphic(s, t));
	}

	public static boolean isIsomorphic(String s, String t) {

		HashMap<Character, Character> hm = new HashMap<>();
		HashMap<Character, Character> hm2 = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i)) && hm.get(s.charAt(i)) != t.charAt(i))
				return false;
			else
				hm.put(s.charAt(i), t.charAt(i));
		}

		for (int i = 0; i < t.length(); i++) {
			if (hm2.containsKey(t.charAt(i)) && hm2.get(t.charAt(i)) != s.charAt(i))
				return false;
			else
				hm2.put(t.charAt(i), s.charAt(i));
		}

		return true;
	}

}
