package dsa_4th_July_2022;

import java.util.Scanner;

public class ShivamCode {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		sc.nextLine();
		char ch[]=new char[n];
		
		for(int i=0;i<ch.length;i++)
		{
			String s= sc.nextLine();
			ch[i]= s.charAt(0);
		}
		
		
		int count=0,count1=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				count++;
			}
			if(ch[i]>='a' && ch[i]<='z')
			{
				count1++;
			}
			
		}
		
		System.out.println("Total UpperCase Elements:: "+count);
		System.out.println("Total LowerCase Elements:: "+count1);
		
	}

}
