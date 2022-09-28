package dsa_28th_Sept_2022;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStringsMapCorrect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "add";
		String t = "dad";
		
		boolean ans = checkIsomorphic(s, t);
		System.out.println(ans);

	}
	
	public static boolean checkIsomorphic(String s, String t) {
		
		if(s.length()!=t.length()) {
			return false;
		}
		
		Map<Character,Character> map1 = new HashMap<>();
		Map<Character,Boolean> map2 = new HashMap<>();
		
		for(int i=0;i<s.length();i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			
			if(map1.containsKey(ch1)) {
				if(map1.get(ch1)!=ch2)
				{
					return false;
				}
			}
			
			else {
				if(map2.containsKey(ch2)) {
					return false;
				}
				
				else {
					map1.put(ch1, ch2);
					map2.put(ch2, true);
				}

		}
		
	}
		
		return true;
	}

}
