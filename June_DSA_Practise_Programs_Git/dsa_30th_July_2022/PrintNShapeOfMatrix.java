package dsa_30th_July_2022;

public class PrintNShapeOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { {1,2,3}, {1,2,3}, {3, 6, 5, } };
		int rowSize = a.length;
		int colSize = a[0].length;
		
		int sum=0;
		for(int i=0;i<rowSize;i++) {
			for(int j=0;j<colSize;j++) {
				if(i==j || j==0 || j==rowSize-1) {
					System.out.print(a[i][j]+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
