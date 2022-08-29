package dsa_29th_aug_2022;

public class ExtractOnlyNumberInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//array, String, math, pattern,search, matrix
		
		String s1 = "100ab89gh79";
		
		/*
		 * String temp = ""; for(int i=0;i<s1.length();i++) { char c = s1.charAt(i);
		 * if(c>='0' && c<='9') { temp = temp +c; } else { System.out.print(temp); temp
		 * = ""; } }
		 * 
		 * System.out.print(temp);
		 */
		
		
		int sum = 0;

		System.out.println();
		
		for(int i=0;i<s1.length();i++) {
			char c = s1.charAt(i);
			if(c>='0' && c<='9') {
				int val = c-'0';
				sum = sum * 10 + val;
				System.out.println("Sum :: "+sum);
			}
		}
		
		System.out.println(sum);

		
		
	}

}
