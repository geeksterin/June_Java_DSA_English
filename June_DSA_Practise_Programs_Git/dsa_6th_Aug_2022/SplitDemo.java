package dsa_6th_Aug_2022;

import java.util.Arrays;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s1 = "Skilled at java";
		
		String s1 = "Skilled at java and angular";

		
		String[] a = s1.split(" "); //Skilled , t j, v
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
