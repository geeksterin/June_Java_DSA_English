package dsa_6th_July_2022;

public class FindDifferenceBetweenMinAndMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10,2,6,78,9};
		
		int max = a[0];
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
			
			if(a[i]<min) {
				min = a[i];
			}
		}
		
		System.out.println(max-min);

	}

}
