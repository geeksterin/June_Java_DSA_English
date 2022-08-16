package dsa_16th_Aug_2022;

public class FindTheSumOfAllSubStringsOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s1 = "1234";
		
		int[] sum = new int[s1.length()];
		
		int x = s1.charAt(0) - '0';  
		sum[0] = x;
		
		int res = sum[0]; // hold the initial sum
		
		for(int i=1;i<s1.length();i++) {
			
			//(i+1) * num[i] + 10 (sum of all substring ending with the digit i-1)
			int num = s1.charAt(i) - '0';
			
			sum[i] = ((i+1) * num + 10*(sum[i-1]));
			
			res = res + sum[i];
			
			
		}
		
		System.out.println(res);
		
	}

}
