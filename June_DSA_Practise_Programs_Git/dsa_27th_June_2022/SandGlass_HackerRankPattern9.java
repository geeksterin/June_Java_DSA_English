package dsa_27th_June_2022;

import java.util.Scanner;

public class SandGlass_HackerRankPattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//inversePyramid();
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		inversePyramid(N);
		pyramid(N);
	}

	 

	static void inversePyramid(int N) {
		
		 for(int i=1;i<=N;i++) {
			 for(int j=1;j<=N;j++) {
				 if(j>=i)
				 {
					 System.out.print(" *");
				 }
				 else {
					 System.out.print(" ");

				 }
			 }
			 
			 System.out.println();
		 }
	}
	
	 static void pyramid(int N) {
			//first print right angle traingle
		
		 for(int i=1;i<=N;i++) {
			 for(int j=N;j>=1;j--) {
				 if(j<=i)
				 {
					 System.out.print(" *");
				 }
				 else {
					 System.out.print(" ");

				 }
			 }
			 
			 System.out.println();
		 }
	}

}
