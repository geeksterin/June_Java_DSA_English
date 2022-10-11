package dsa_11th_Oct_2022;

public class PrintStringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello";
		int x = s.length() - 1;
		
		print(x,s);
	}

	private static void print(int x, String s) {

		if(x<0) {
			return;
		}
		System.out.println(s.charAt(x));
		print(--x,s);
	}

}
