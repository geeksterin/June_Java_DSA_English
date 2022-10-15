package dsa_15th_Oct_2022;

public class LongestSubStringWithoutRepeatinfCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "madamer";
		s1 = s1.toLowerCase();
		int count =0;
		
		String palindrome = "";
		
		int maxLength = 0;
		for(int i=0;i<s1.length();i++) {
			for(int j=i;j<s1.length();j++) {
				String str = s1.substring(i,j+1);
				//System.out.println(str);
				if(str.length()>1 && isPalindrome(str)) {
					//System.out.println(str);
					int len = str.length();
					//System.out.println("len -> "+len);
					
					if(len>maxLength) {
						maxLength = len;
						palindrome = str;
					}
				}
			}
		}
		
		//System.out.println(count);
		System.out.println(maxLength);
		System.out.println(palindrome);
	}
	
	public static boolean isPalindrome(String k) {
		int i = 0;
		int j = k.length()-1;
		
		while(i<=j) {
			if(k.charAt(i)!= k.charAt(j)) {
				return false;
			}
			
			i++;
			j--;
		}
		
		return true;
	}

}
