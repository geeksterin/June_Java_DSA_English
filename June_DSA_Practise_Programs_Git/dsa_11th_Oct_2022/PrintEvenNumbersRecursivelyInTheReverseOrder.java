package dsa_11th_Oct_2022;

public class PrintEvenNumbersRecursivelyInTheReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 100;
		printEven(x);
	}

	private static void printEven(int x) {

		if(x<2) {
			return;
		}
		
		if(x%2==0) {
			System.out.println(x);

		}
		printEven(--x);
	}

}
