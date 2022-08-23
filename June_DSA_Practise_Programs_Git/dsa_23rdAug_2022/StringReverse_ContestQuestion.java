package dsa_23rdAug_2022;

import java.util.Arrays;

public class StringReverse_ContestQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "aZgoodZZZexample";

		System.out.println(s1);
		String w[] = s1.split("Z");

		String temp = "";

		for (int i = w.length - 1; i >= 0; i--) { 

			if ((w[i].length()!=0)) {

				temp = temp + w[i] + " ";
			}
		}

		System.out.println(temp);
		
		String k = "";
		

	}

}
