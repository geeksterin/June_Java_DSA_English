package dsa_19th_Aug_2022;

import java.util.Scanner;

public class PrintArmStrongForARange_HackerRank_OnlyForPowerofCube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		sc.close();
		
		for(int i =x;i<=y;i++) {
			boolean b = checkArmStrong(i);
			
			if(b==true) {
				System.out.println(i);
			}
		}
		
		
	}
	
	
	static boolean checkArmStrong(int num){
		boolean armStrong = true;
		
		int n = num;
	
		double sum = 0.0;
		while(n>0) {
			int digit = n%10;
			n = n/10;
			double res = Math.pow(digit, 3); // Find the cube of a digit
			
			sum = sum+res;
			
		}
		
		int newSum = (int) sum;
		if(newSum == num) {
			armStrong = true;
		}
		
		else {
			armStrong = false;
		}
		
		return armStrong;
		
		
	}

}
