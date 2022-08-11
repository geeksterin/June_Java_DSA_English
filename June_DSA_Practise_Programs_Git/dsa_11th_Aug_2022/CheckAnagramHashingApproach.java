package dsa_11th_Aug_2022;

import java.util.Arrays;

public class CheckAnagramHashingApproach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abbced";
		String s2 = "bedbato";
		
		boolean anagram = true;
		
		if(s1.length()!=s2.length()) {
			anagram = false;
		}
		
		else {
			s1 = s1.toLowerCase();
			s2 = s2.toLowerCase();
			
			int t1[] = new int[26];
			int t2[] = new int[26];
			
			for(int i=0;i<s1.length();i++) {
				
				char ch1 = s1.charAt(i);
				int ind1 = ch1 - 'a';
				t1[ind1] = t1[ind1] + 1;
				
				
				char ch2 = s2.charAt(i);
				int ind2 = ch2 - 'a';
				t2[ind2] = t2[ind2] + 1;
				
			}
			
			anagram = Arrays.equals(t1, t2);
		}
		
		
		
		System.out.println(anagram);


	}

}
