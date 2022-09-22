package dsa_22_Sep_2022;

public class FindNextGreaterElementToLeft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,4,3,12,1,3};
		
		System.out.print(-1 + " ");
		
		for(int i=1;i<a.length;i++) {
			boolean found = false;
			int num = a[i];
			
			for(int j=i-1;j>=0;j--) {
				if(a[j]>num) {
					System.out.print(a[j]+ " ");
					found = true;
					break;
				}
			}
			
			if(found==false) {
				System.out.print(-1+" ");
			}
		}
	}

}
