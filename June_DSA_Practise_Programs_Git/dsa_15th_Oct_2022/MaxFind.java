package dsa_15th_Oct_2022;

public class MaxFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,4,2,8};
		
		int max = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
	}

}
