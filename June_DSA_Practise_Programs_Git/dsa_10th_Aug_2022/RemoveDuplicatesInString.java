package dsa_10th_Aug_2022;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = new String("abbdferefered");
		String s2 = new String();

		for(int i=0;i<s1.length();i++) {
			char c = s1.charAt(i);
			if(!s2.contains(c+"")) {
				s2 = s2 + c;
			}
		}
		
		System.out.println(s2);

	
	}

}
