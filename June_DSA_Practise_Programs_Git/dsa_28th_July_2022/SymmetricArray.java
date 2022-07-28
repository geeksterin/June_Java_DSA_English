package dsa_28th_July_2022;

public class SymmetricArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][] = {{2,3,6},{3,4,5},{6,5,9}};
		
		boolean flag = true;
		
		int m = a.length;
		int n = a[0].length;
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(a[i][j]!=a[j][i]) {
					flag = false;
					break;
				}
			}
		}
		
		System.out.println(flag);
	}

}
