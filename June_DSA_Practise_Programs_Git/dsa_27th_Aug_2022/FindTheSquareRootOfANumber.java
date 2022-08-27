package dsa_27th_Aug_2022;

public class FindTheSquareRootOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;
		
		int ans = findSquareRoot(x);
		
		System.out.println(ans);
	}

	private static int findSquareRoot(int x) {
		int start = 1;
		int end = x/2;
		
		if(x==1) {
			return 1;
		}
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(mid *mid == x) {
				return mid;
			}
			
			else if(x > mid * mid) {
				//right
				
				start = mid +1;
			}
			
			else {
				//left
				end = mid -1;
			}
		}
		
		return -1;
		
		
	}

}
