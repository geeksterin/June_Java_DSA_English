package dsa_23rd_June_2022;

import java.util.Scanner;

public class printMultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = readData();
		printMulTable(num);
	}
	
	 static void printMulTable(int num) {
		
		 //14 * 1 = 14
		 for(int i=1;i<=10;i++) {
			 System.out.println(num +"x"+i+" = "+num * i);
		 }
		
	}

	static int readData() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		return n;
	}

}
