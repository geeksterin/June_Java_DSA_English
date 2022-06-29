package dsa_29th_June_2022;

public class PrintReverseAlernateNumbersinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,30,40,50}; //50,30,10
		
		for(int i =a.length-1;i>=0;i=i-2) {
			System.out.println(a[i]);
		}
	}

}
