package dsa_30th_July_2022;

public class NithinCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = { {1,2,3}, {1,2,3}, {3, 6, 5, } };
		int n = a.length;
		int m = a[0].length;
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j || j==0 || j==m-1) {
					System.out.print(a[i][j]);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
