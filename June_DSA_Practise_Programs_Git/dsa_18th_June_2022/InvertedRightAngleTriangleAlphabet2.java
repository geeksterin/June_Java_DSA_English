package dsa_18th_June_2022;

public class InvertedRightAngleTriangleAlphabet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for (char c = 'E'; c >= 'A'; c--) { for (char d = 'E'; d >= ; d--) {
		 * System.out.print(d); } System.out.println(); }
		 */

		/*
		 * for (char c = 'A'; c <= 'E'; c++) { for (char d = 'E'; d >= c; d--) {
		 * System.out.print(c); } System.out.println(); }
		 */
		
		for(char c ='A';c<='E';c++) {
			for(char d='E'; d>=c; d--) {
				System.out.print(d);
			}
			System.out.println();
		}
	}

}
