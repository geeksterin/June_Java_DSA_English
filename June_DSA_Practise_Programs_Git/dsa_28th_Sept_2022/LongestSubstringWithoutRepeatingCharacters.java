package dsa_28th_Sept_2022;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "abcabcbb";
		
		Map<Character,Integer> map = new HashMap<>();
		int start = 0;
		int end = 0;
		int max = 0;
		int len = 0;
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(map.containsKey(ch) && map.get(ch)>=start) {
				start = map.get(ch) + 1;
			}
			
			map.put(ch, i);
			end = i;
			len = end - start;
			max = Math.max(max,len);
		}
		
		max = max +1;
		System.out.println(max);
		
	}

}
