package dsa_13th_Aug_2022;

public class PrintAllSubStringsOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ANTARTICA";
		
		for(int i=0;i<s1.length();i++) {
			for(int j=i;j<s1.length();j++) {
				String temp = s1.substring(i,j+1);
				System.out.println(temp);
			}
		}
	}

}
