package dsa_22_Aug_2022;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b = 1111;
		
		String s = b +"";
		
		int sum = 0;
		
		int j =0;
		for(int i=s.length()-1;i>=0;i--) {
			int num = s.charAt(i) - '0';
			sum = (int) (sum + (num * Math.pow(2, j++)));
			
		}
		
		System.out.println(sum);
	}

}
