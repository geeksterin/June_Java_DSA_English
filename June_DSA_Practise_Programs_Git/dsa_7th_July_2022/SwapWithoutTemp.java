package dsa_7th_July_2022;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;

		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a);
		System.out.println(b);		
		

	}

}
