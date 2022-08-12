package dsa_12th_Aug_2022;

public class AbhishekCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aab"; //a2b1
		int c = 0;
		int j = 0;
		String temp = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == (s.charAt(j))) {
				c++;
			}
			else {
				temp = temp +s.charAt(j) + c;
				//System.out.print(s.charAt(j) + c);
				j =j+c;
				c = 1;
			}

		}
		
		temp = temp +s.charAt(j)+c;
		
		System.out.println(temp);
	}
}
