package dsa_6th_Aug_2022;

import java.util.Arrays;

public class CountTheWordsUsingSplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "This is the practise session at Geekster";
		
		String[] a = s.split(" ");
		
		System.out.println(Arrays.toString(a));
		System.out.println(a.length);
	}

}
