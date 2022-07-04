package dsa_4th_July_2022;

import java.util.Scanner;

public class CountUpperCaseCharactersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.nextLine();

		char ch[] = new char[n];
		
		for(int i=0;i<ch.length;i++) {
			String s = sc.nextLine();
			ch[i] = s.charAt(0);
			
		}

		int count = 0;
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] >= 'A' && ch[i] <= 'Z') {
				System.out.println(ch[i]);
				count++;
			}

		}

		System.out.println(count);

	}

}
