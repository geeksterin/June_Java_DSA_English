package dsa_3rd_Aug_2022;

public class RotateMatrixAntiClockwise90Degree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};

		int m = a.length;
		int n = a[0].length;

		System.out.println("Original Array : ");
		
		for(int i =0;i<m;i++) {
			for(int j =0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		for(int i =0;i<m;i++) {
			for(int j =i;j<n;j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
			
		}
		
		System.out.println();
		System.out.println("Transposed Array : ");

		for(int i =0;i<m;i++) {
			for(int j =0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
		
		
		int i = 0;
		int k = m-1;
		while(i<k) {
			
			for(int j=0;j<n;j++) {
				
				//swap the ith row element with kth row element
				int temp = a[i][j];
				a[i][j] = a[k][j];
				a[k][j] = temp;
			}
			
			i++;
			k--;
		}
		
		
		System.out.println();
		System.out.println("Rotated Array : ");

		for(i =0;i<m;i++) {
			for(int j =0;j<n;j++) {
				System.out.print(a[i][j]+" ");
			}
			
			System.out.println();
		}
		
	}

}
