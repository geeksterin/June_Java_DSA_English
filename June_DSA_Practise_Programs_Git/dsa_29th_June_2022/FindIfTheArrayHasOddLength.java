package dsa_29th_June_2022;

public class FindIfTheArrayHasOddLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,3,4,6,90,9};
		
		boolean b = false;
		if(a.length%2!=0) {
			b = true;
		}
		
		System.out.println(b);
	}

}
