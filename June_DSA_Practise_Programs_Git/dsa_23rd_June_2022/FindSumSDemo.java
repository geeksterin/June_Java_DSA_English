package dsa_23rd_June_2022;

import java.util.Scanner;

public class FindSumSDemo {
	
	public static void main(String[] args) {
		
		//read data
		//fins sum
		
		int num = readData();
		int sum = findSum(num);
		System.out.println(sum);
		
	}

	 static int findSum(int num) {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum = sum + i;
		}
				
		return sum;
	}

	 static int readData() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		return n;
	}
	
	
}
