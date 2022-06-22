package dsa_22nd_june_2022;

import java.util.Scanner;

public class ShivamCode {


		public static void main(String[] args) {
			 Scanner sc= new Scanner(System.in);
			 System.out.println("Enter The Number:");
				int n= sc.nextInt();
				int tempNum=n;
				int rev=0;
				while(n>0)
				{
					int remain=0;
					remain=n%10;
					rev=rev*10+remain;
					
				 n=n/10;
					
				}
				if(tempNum==rev)
				System.out.println(tempNum+" is a Palindrome Number");

		}

	}


