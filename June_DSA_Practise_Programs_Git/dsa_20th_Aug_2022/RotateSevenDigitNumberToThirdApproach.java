package dsa_20th_Aug_2022;

public class RotateSevenDigitNumberToThirdApproach {

	public static void main(String[] args) {
		int num = 1234567;
		
		int n = num;
		int rev = 0;
		int count = 0;
		int part1 = 0;
		
		 while(n>0) {
			 count++;
			 int rem = n %10;
			 rev = rev * 10 + rem;
			 
			 if(count==3) {
				 part1 = reverse(rev);
				 rev=0;
			 }
			
			 
			 n = n/10;

		 }
		
		 int part2 = reverse(rev);
		 
		 System.out.println(part1);
		 System.out.println(part2);
		 
		 int res = part1 * 10000  + part2;
		 
		 System.out.println(res);

	}
	
	 static int reverse(int n) {
		 
		 int rev = 0;
		 while(n>0) {
			 int rem = n %10;
			 n = n/10;
			 rev = rev * 10 + rem;
		 }
		return rev;
		
	}
}
