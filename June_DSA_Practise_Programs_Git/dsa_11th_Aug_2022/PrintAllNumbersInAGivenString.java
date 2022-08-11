package dsa_11th_Aug_2022;

public class PrintAllNumbersInAGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "a1gh674e";
		
		int sum = 0;
		
		for(int i=0;i<s1.length();i++) {
			char c1 = s1.charAt(i);
			if(c1>='0' && c1<='9') {
				//System.out.print(c1);
				
				//int num = Integer.parseInt(c1+"");
				
				int num = c1 - '0';
				sum = sum + num;
			}
		}
		
		System.out.println(sum);
		
		/*
		 * for(int i=0;i<s1.length();i++) { char c = s1.charAt(i);
		 * if(Character.isDigit(c)) { System.out.print(c);
		 * 
		 * } }
		 */
	}

}
