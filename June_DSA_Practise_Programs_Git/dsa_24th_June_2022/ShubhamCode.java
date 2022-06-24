package dsa_24th_June_2022;

public class ShubhamCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int x = 0;
		while (i < 4) {
			int j = 1;
			x++;
			while (j < 4) {

				System.out.print(x + " ");
				x = x + 3;
				j++;

			}
			x = i;
			System.out.println("");
			i++;
		}

	}

}
