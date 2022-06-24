package dsa_24th_June_2022;

public class BusCarGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i =1;i<=100;i++) {
			System.out.println(i);
			
			if(i%5==0 && i%10!=0) {
				System.out.println("CAR");
			}
			
			else if(i%10==0) {
				System.out.println("BUS");
			}
		}
	}

}
