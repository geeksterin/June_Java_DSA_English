package dsa_22nd_june_2022;

public class FindIfAGivenNumberIspalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1221;
		int temp = num;
	
		
		int rev = 0;
		
		while(num>0) {
			int digit = num %10;  
			rev = rev * 10 + digit;  
			num = num/10; 
		}
	
	
	if(temp==rev) {
		System.out.println("Palindrome");
	}
	
	else {
		System.out.println("Non palindrome");
	}
	}
}
