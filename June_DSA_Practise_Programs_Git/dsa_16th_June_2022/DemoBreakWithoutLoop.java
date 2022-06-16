package dsa_16th_June_2022;

public class DemoBreakWithoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n = 100;
		
		for(int i =1;i<=n;i++) {
			if(i%2==1)
			{
				continue;
			}
			
			System.out.println(i);
		}
		
		
	}

}
