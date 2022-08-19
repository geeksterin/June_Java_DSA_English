package dsa_19th_Aug_2022;

public class PrintArmStrongForARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;
		int y = 200;
		
		for(int i =x;i<=y;i++) {
			boolean b = checkArmStrong(i);
			
			if(b==true) {
				System.out.println(i);
			}
		}
		
		
	}
	
	
	static boolean checkArmStrong(int num){
		boolean armStrong = true;
		
		// Get the number of digits -> count
		// Get the digit -> digit
		// Find the power of digit with count Ex -> 2 pow 9
		// sum the power of all digits -> res
		// check if res == original num, If so, its armstrong
		
		
		int n = num;
		int count = 0;
		
		while(n>0) {
			n = n/10;
			count++;
		}
		
				
		n = num;
		
	
		
		double sum = 0.0;
		while(n>0) {
			int digit = n%10;
			n = n/10;
			double res = Math.pow(digit, count); 
			
			sum = sum+res;
			
		}
		
		int newSum = (int) sum;
		if(newSum == num) {
			armStrong = true;
		}
		
		else {
			armStrong = false;
		}
		
		return armStrong;
		
		
	}

}
