package dsa_16th_June_2022;

public class FirstNumberDivisibleby9and6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100000;
		
		for(int i =1;i<=n;i++) {
			if(i%9==0 && i%6==0) {
				System.out.println(i);
				break;
			}
		}
	}

}
