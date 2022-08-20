package dsa_20th_Aug_2022;

public class Divideby2and3and5AndFindSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 243;
		
		int step = 0;


		while(num%2 == 0) {
			num = num/2;
			step = step + 2;
		}
			
		
		while(num%3 == 0) {
			num = num/3;
			step = step + 3;
		}
		
		
		while(num%5 == 0) {
			num = num/5;
			step = step + 5;
		}
		
		System.out.println(step);
		System.out.println(num);

	}

}
