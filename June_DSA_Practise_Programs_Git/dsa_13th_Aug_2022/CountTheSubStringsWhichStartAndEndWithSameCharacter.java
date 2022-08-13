package dsa_13th_Aug_2022;

public class CountTheSubStringsWhichStartAndEndWithSameCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ANTARTICA";

		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i ; j < s1.length(); j++) {
				/*
				 * String temp = s1.substring(i,j+1); if(temp.charAt(0)==
				 * temp.charAt(temp.length()-1)) { count++; }
				 */
				
				if(s1.charAt(i)==s1.charAt(j)) {
					count++;
				}
				
			}
		}

		System.out.println(count);
	}

}
