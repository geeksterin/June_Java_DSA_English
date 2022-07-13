package dsa_13th_July_2022;

public class FindTheMissingNumberInTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,5,7,4,2,3,8};
		int n = a.length+1;

		int totalSum = n*(n+1)/2;
		System.out.println(totalSum);
		
		int sum = 0;
		
		int i =0;
		int j = a.length-1;
		
		while(i<=j) {
			if(i<j) {
				sum = sum +a[i] +a[j];
			}
			else {
				sum = sum +a[j]; // i and j will be same. So pick either a[i] or a[j]
			}
			
			i++;
			j--;
		}
		
		
		System.out.println(sum);
		
		System.out.println(totalSum-sum);
	}

}
