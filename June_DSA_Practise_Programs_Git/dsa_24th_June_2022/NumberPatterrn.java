package dsa_24th_June_2022;

public class NumberPatterrn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int c = 0;

		for (int i = 0; i < 3; i++) {
			c += 1;
			int x = c;
			for (int j = 0; j < 3; j++) {

				System.out.print(x + " ");
				x += 3;
			}
			System.out.println();
		}

	}

}
