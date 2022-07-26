package dsa_26th_July_2022;

public class ColumnSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{1,2,3},{4,5,6}};
		
		int m = a.length;
		int n = a[0].length;
		
		for(int j=0;j<n;j++) {
			int sum =0;
			for(int i=0;i<m;i++) {
				sum += a[i][j];
			}
			System.out.println(sum);
		}
	}

}
