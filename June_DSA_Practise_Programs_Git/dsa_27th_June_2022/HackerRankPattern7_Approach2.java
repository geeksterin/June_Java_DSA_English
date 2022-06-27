package dsa_27th_June_2022;

public class HackerRankPattern7_Approach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j<=n-i) {
					System.out.print(" ");
				}
				
				else {
					System.out.print("*");
				}
			}
			
			System.out.println();
		}
	}

}
