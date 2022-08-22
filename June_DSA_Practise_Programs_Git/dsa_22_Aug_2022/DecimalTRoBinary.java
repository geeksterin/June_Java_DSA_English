package dsa_22_Aug_2022;

public class DecimalTRoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5678;
		String s1 = "";
		
		while(n>0) {
			int rem = n % 2;
			s1 = rem + s1;
			n = n/2;
		}
		
		System.out.println(s1);
		
	}
	
	
	
}


