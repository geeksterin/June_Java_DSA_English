package dsa_4th_Aug_2022;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello";
		
		//System.out.println(s.length());
		char[] c = s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
		
		
		//s.length()
		
		System.out.println("Using charAt");
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
		
		
	}

}
