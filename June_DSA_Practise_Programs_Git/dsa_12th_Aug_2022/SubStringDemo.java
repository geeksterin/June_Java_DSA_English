package dsa_12th_Aug_2022;

public class SubStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abc";
		
		for(int i=0;i<s1.length();i++) {
			for(int j=i;j<s1.length();j++) {
				for(int k=i;k<=j;k++) {
					
					System.out.print(s1.charAt(k));
				}
				
				System.out.println();
			}
		}
	}

}

