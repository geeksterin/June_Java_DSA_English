package dsa_1st_July_2022;

public class FindNumbersGreaterThanANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,30,78,8,9};
		int b = 15;
		
		int count = 0;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>b) {
				count++;
				System.out.println(count);

			}
			
		}
		
	}

}
