package dsa_16th_June_2022;

public class Multiplesof3and5and3and5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 68;

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				System.out.print(i + " ");
			}

		}
	}

}
