package dsa_23_Sep_2022;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfAllCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ch= {'p','a','b','a','d','e'};
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<ch.length;i++) {
			char c = ch[i];
			
			if(map.containsKey(c)) {
				int currentFreq = map.get(c);
				//add 1 to currentFreq
				map.put(c, currentFreq+1);
			}
			
			else {
				//character is found first time, so put the count as 1
				map.put(c, 1);
			}
		}
		
		System.out.println(map);
		
		
	}

}
