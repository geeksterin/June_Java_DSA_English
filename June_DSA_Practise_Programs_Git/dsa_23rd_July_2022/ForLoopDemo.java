package dsa_23rd_July_2022;

public class ForLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int m = a.length;
		int n = a[0].length;
		int x = 6;
		
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j] == x) {
					break;
				}
				
				else {
					System.out.print(a[i][j]+" ");
				}
			}
		}
	}

}
