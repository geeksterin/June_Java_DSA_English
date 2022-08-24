package dsa_24th_Aug_2022;

public class LCMFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 10;
		int b = 15;
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		int multiplier = 0;
		for(int i=1;i<Integer.MAX_VALUE;i++) {
			
			multiplier = max * i;
			
			if(multiplier % min == 0) {
				break;
			}
			
			
		}
		
		System.out.println(multiplier);
	}

}
