package dsa_11th_Oct_2022;

public class PrintNumbersFromReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		print(x);
	}

	private static void print(int x) {

		if(x<1) {
			return;
		}
		
		System.out.println(x);
		print(--x);
		
	}

}
