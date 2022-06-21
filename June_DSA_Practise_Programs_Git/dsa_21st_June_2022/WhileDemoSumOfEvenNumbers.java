package dsa_21st_June_2022;

public class WhileDemoSumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 11;
		
		int mul = 1;
		
		/*for(int i =2;i<=n;i=i+2) {
				mul = mul * i;
		}
		
		System.out.println(mul);*/
		
		int j =1;
		
		
		while(j<=n) {
			if(j%2==0) {
				 mul = mul * j;
			}
			
			j++;
		}
		/*
		 * while(j<=n) { mul = mul * j; j = j+2; }
		 */
		
		System.out.println(mul);
	}

}
