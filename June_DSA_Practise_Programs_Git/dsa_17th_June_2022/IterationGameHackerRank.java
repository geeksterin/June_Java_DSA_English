package dsa_17th_June_2022;

import java.util.Scanner;

public class IterationGameHackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++) {
			
			System.out.println("index : "+i);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(i%2==0) {
				//even num
				System.out.println(a+b);
			}
			
			else {
				System.out.println(a*b);
			}
		}
	}

}
