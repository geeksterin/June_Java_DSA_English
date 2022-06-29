package dsa_29th_June_2022;

public class FindSumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,2,3,4,5};
		
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		
		System.out.println(sum);
	}

}
