package dsa_24th_Aug_2022;

import java.util.Arrays;
import java.util.Scanner;

public class charArrayInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		s.nextLine();
		
		char c[] = new char[n];
		
		for(int i=0;i<n;i++) {
			String s1 = s.nextLine();
			c[i] = s1.charAt(0);
		}
		
		s.close();
		
		System.out.println(Arrays.toString(c));
	}

}
