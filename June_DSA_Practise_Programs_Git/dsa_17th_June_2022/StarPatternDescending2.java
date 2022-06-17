package dsa_17th_June_2022;

public class StarPatternDescending2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
