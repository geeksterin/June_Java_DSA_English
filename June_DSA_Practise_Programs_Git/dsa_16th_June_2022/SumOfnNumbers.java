package dsa_16th_June_2022;

import java.util.Scanner;

public class SumOfnNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		
		/*
		 * for(int i =1;i<=n;i++) { diff = diff - i; System.out.println(diff); }
		 */
		
		for(int i=1;i<=n;i++)
		{
			sum = sum + i; // sum += i;  // sum = sum + i // sum += i;
		}
		
		System.out.println(sum);
		
	}

}
