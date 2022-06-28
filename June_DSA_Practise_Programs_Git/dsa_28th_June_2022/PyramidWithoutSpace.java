package dsa_28th_June_2022;

public class PyramidWithoutSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rowSize = 5;
		int colSize = 9;
		
		for(int i=1;i<=rowSize;i++) {
			for(int j=1;j<=colSize;j++) {
				
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
