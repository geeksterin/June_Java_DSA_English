package dsa_27th_Sept_2022;

import java.util.HashMap;
import java.util.Map;

//To be completed yet. Partial working program
public class FindIsomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "bbbaaaba";
		String t = "aaabbbba";
		
		//"bbbaaaba"
		//"aaabbbba"

		Map<Character, Integer> map1 = findFrequency(s);
		Map<Character, Integer> map2 = findFrequency(t);
		
		//System.out.println(map1);
		//System.out.println(map2);

	
		boolean isomorphic = true;
		

		if(s.length()==t.length() && !map1.equals(map2)) {
			
			for(int i=0;i<s.length();i++) {
				
				//take the char one by one in s
				char ch1 = s.charAt(i);
				int f1 = map1.get(ch1);
				
				//take the char one by one in t
				char ch2 = t.charAt(i);
				int f2 = map2.get(ch2);
				
				if(f1!=f2) {
					isomorphic = false;
					break;
				}
				
			}
			
			System.out.println(isomorphic);
		}
		
		else if(s.length()==t.length() && s.length()==1 && s.charAt(0)==t.charAt(0)) {
			isomorphic = true;
		}
		
		else if(s.length()==t.length() && s.length()==1 && s.charAt(0)!=t.charAt(0)) {
			isomorphic = false;
		}
		
		else {
			isomorphic = false;

		}
		

	}

	static Map<Character, Integer> findFrequency(String a) {
		Map<Character, Integer> mp = new HashMap<>();

		for (int i = 0; i < a.length(); i++) {
			char ch = a.charAt(i);

			if (mp.containsKey(ch)) {
				int freq = mp.get(ch);
				mp.put(ch, freq + 1);
			} else {
				mp.put(ch, 1);
			}
		}
		return mp;
	}

}
