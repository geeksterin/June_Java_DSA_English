package dsa_24th_Aug_2022;

public class GCDFinder {

	public static void main(String[] args) {

		int a = 72;
		int b = 144;
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		int res = 1;
		for(int i=min;i>=1;i--) {  // 72
			if(max % i ==0 && min % i==0) {
				res = i;
				break;
			}
		}
		
		System.out.println(res);
	}

}
