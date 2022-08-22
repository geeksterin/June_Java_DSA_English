package dsa_22_Aug_2022;

public class DecimalTRoBinary2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;
		int b[] = new int[32];
		
		int i =0;
		while(n>0) {
			int rem = n % 2;
			b[i] = rem;
			i++;
			n = n/2;
		}
		
		for(i =b.length-1;i>=0;i--) {
			System.out.print(b[i]);
		}
	}
	
	
	
}


