package dsa_24th_June_2022;

public class PrintArmStrongNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =1;i<100000;i++) {
			
			int num = i;
			int temp = i;
			
			int sum = 0;
			while(num>0) {
				int digit = num %10;
				int cube = digit * digit * digit;
				sum = sum +cube;
				num = num/10;
			}
			
			if(temp==sum) {
				System.out.println(temp);
			}
		}
		
		
	}

}
