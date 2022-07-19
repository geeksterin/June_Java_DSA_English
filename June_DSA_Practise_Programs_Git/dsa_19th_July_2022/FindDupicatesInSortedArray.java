package dsa_19th_July_2022;

public class FindDupicatesInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,3,4,4,4,4,5,6,7};
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				System.out.println(a[i]);
			}
		}
	}

}
