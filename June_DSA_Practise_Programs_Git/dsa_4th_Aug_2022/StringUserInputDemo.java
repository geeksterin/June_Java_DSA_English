package dsa_4th_Aug_2022;

import java.util.Scanner;

public class StringUserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		String s1 = sc.nextLine();
		System.out.println(s1);
		
		int count = 0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i) == ' ') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
