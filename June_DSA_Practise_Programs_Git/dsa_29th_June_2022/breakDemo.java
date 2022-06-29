package dsa_29th_June_2022;

public class breakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<3;i++) {
			for(int j=10;j<15;j++) {
				if(j==12) {
					System.out.println("Helloworld . We are at 12 in j");
					break;
				}
				System.out.println(i+","+j);
			}
		}
	}

}
