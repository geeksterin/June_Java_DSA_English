package dsa_11th_Aug_2022;

import java.util.Arrays;

public class CheckIfAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abbced";
		String s2 = "bedbac";
		
		boolean anagram = true;
		
		if(s1.length()!=s2.length()) {
			anagram = false;
			return;
		}
		
			char [] c1 = s1.toCharArray();  //s1
			char [] c2 = s2.toCharArray();  //s2
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			for(int i=0;i<c1.length;i++) {
				if(c1[i]!=c2[i]) {
					anagram = false;
					break;
				}
			}

		
		
		System.out.println(anagram);
		
		
	}

}
