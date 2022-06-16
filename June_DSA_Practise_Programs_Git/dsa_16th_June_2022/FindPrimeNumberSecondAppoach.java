package dsa_16th_June_2022;

public class FindPrimeNumberSecondAppoach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 101; // divisible by 1 and itself
		
		boolean isPrime = true;
		
		for(int i = 2;i<n;i++) {
			
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
		
		System.out.println(isPrime);
	}

}
