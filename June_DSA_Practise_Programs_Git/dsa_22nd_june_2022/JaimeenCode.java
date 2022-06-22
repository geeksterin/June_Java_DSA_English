package dsa_22nd_june_2022;

import java.util.Scanner;

public class JaimeenCode {

	public static void main(String[] args) {
		int n, reverse = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int add = 0;
		int n1 = n;
		while (n > 0) {
			int remainder = n % 10;
			add = add + remainder;
			n = n / 10;
		}
		System.out.println(add);
		int add_1 = 0;
		add_1 = n1 + add;
		int add_2 = 0;
		for (int i = add_1; i <= 500; i = i + add) {
			add_2 = 0;
			int n_1 = i;

			while (n_1 > 0) {
				int remainder = n_1 % 10;
				add_2 = add_2 + remainder;
				n_1 = n_1 / 10;
			}
			if (add_2 == (2 * add)) {
				System.out.println("add " + i);
				break;
			}

		}
	}
}
