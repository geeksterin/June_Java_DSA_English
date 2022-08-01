package dsa_1st_August_2022;

public class Sum_Of_Absolute_Differences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,3,5};
		
		for(int i=0;i<a.length;i++) {
			int res = 0;
			for(int j=0;j<a.length;j++) {
				res = res + Math.abs(a[i]-a[j]); // 0
			}
			
			System.out.println(res);
		}
	
	}

}
