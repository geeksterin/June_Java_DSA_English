package dsa_28th_June_2022;

public class InversePyramidWithoutSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rowSize = 4;
		int colSize = 7;
		
		for(int i=rowSize;i>=1;i--) {
			for(int j=colSize;j>=1;j--) {
				
				if(j>=rowSize-i+1 && j<=rowSize+i-1) {
					System.out.print("*");
				}
				
				else {
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}
