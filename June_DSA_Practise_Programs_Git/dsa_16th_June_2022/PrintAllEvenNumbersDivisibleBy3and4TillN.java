package dsa_16th_June_2022;

import java.util.Scanner;

public class PrintAllEvenNumbersDivisibleBy3and4TillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++) {
			//even number
			//divisinble by 3
			//divisinble by 4
			
			if(i%2==0 && i%3==0 && i%4==0) {
				System.out.println(i);
			}
				
		}

	}

}
