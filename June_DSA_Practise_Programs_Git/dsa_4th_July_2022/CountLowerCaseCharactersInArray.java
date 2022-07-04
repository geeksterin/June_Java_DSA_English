package dsa_4th_July_2022;

import java.util.Scanner;

public class CountLowerCaseCharactersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.nextLine();
		
		char a[] = new char[n];
		
		for(int i=0;i<a.length;i++) {
			String s = sc.nextLine();
			a[i] = s.charAt(0);
		}
		
		
		int count = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>='0' && a[i]<='9') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
