package dsa_23rd_June_2022;

import java.util.Scanner;

public class FindArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = readData();
		findArmStrong(num);
		
	}
	
	//153 -> 1 cube + 5 cube + 3 cube
	 static void findArmStrong(int num) {
		 int temp = num;
		 
		 //find digit
		 // find cube of digit
		 // find sum of all cubes
		 
		 int sum = 0;
		 
		 while(num>0) {
			 int digit = num %10;
			 int cube = digit * digit * digit;
			 sum = sum + cube;
			 
			 num = num/10;
		 }
		 
		 
		 if(sum == temp) {
			 System.out.println("Armstrong");
		 }
		 
		 else {
			 System.out.println("Non Armstrong");
		 }
		
	}

	static int readData() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		return n;
	}

}
