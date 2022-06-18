package dsa_18th_June_2022;

public class InvertedRightAngleTriangleAlphabet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rowSize = 5;
		int colSize = 5;

		/*
		 * for(char c1='A';c1<='E';c1++) { for(char c2='A';c2<'E';c2++) {
		 * System.out.print(c1); }
		 * 
		 * System.out.println(); } }
		 */

		/*
		 * char ch = 'A'; for(int i=0;i<rowSize;i++) { for(int j=0;j<rowSize-i;j++) {
		 * System.out.print(ch); } ch++; System.out.println(); }
		 */

		/*
		 * char ch = 'A'; for (int i = 0; i < rowSize; i++) { for (int j = rowSize - i;
		 * j > 0; j--) { System.out.print(ch); } ch++; System.out.println(); }
		 */

		// char ch = 'A';

		/*
		 * for (char c = 'A'; c <= 'E'; c++) { for (char d = 'E'; d >= c; d--) {
		 * System.out.print(c); } System.out.println(); }
		 */
		
		
		/*
		 * for(char c1='E';c1>='A';c1--) { for(char c2=c1;c2>='A';c2--) {
		 * System.out.print(c2+ " "); } System.out.println(); }
		 */

		
		
		for(char c1='E';c1>='A';c1--) {//E --> D --> C --> B
			for(char c2=c1; c2>='A';c2--) {
				System.out.print(c2+" ");
			}
			
			//	E D C B A	
			//  D C B A
			//  C B A
			//  B A
			//  A
			System.out.println();
		}
	}

}
