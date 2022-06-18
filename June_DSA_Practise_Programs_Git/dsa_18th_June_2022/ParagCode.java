package dsa_18th_June_2022;

public class ParagCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 02;
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(num + " ");
				num = num + 2;
			}
			System.out.println();
		}
	}

}
