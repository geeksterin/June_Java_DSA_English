package dsa_18th_June_2022;

public class PrintRightTriangleIncreasingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 1;
		for(int i=0;i<=3;i++) {
			for(int j=0; j<=i;j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}
