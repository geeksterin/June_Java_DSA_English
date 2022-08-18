package dsa_18th_Aug_2022;

public class MaximumConsecutiveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,1,1,1,0,0};
		
		int count = 0;
		int max = 0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==0) {
				count++; // 2
				max = Math.max(count, max); 
			}
			
			else {
				count = 0;
			}
			
		}
		
		System.out.println(max);
		
	}

}
