package dsa_18th_June_2022;

public class RightTriangleAlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(char c1='A';c1<='D';c1++) {
			
			for(char c2='A'; c2<=c1;c2++) {
				System.out.print(c2+" ");
			}
			
			System.out.println();
		}
	}

}
