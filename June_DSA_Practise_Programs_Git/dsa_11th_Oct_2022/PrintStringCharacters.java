package dsa_11th_Oct_2022;

public class PrintStringCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";
		
		int x = 0;		
		print(x,s1);
	}

	private static void print(int x, String s) {

		if(x == s.length()) {
			return;
		}
		
		System.out.println(s.charAt(x));
		
		print(++x,s);
	}

}
