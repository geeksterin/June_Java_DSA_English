package dsa_16th_Aug_2022;

public class FindTheCountOfSubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abd";
		//we can use the formula to get the count of substrings
		// n(n+1)/2; // where n -> is the length of the string
		
		int len = s1.length();
		int count = len*(len+1)/2;
		
		System.out.println(count);
		
		
	}

}
