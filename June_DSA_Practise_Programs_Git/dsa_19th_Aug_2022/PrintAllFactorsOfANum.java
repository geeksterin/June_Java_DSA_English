package dsa_19th_Aug_2022;

public class PrintAllFactorsOfANum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 12;
		
		System.out.println(1);
		
		for(int i =2 ;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		System.out.println(num);
	}

}
