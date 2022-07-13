package dsa_13th_July_2022;

import java.util.Arrays;

public class SortByCharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c[] = {'a','H','o','j'};
		
		int i = 0;
		int j = c.length-1;
		
		while(i<j) {
			if(c[i]>='a' && c[i]<='z') {
				i++;
			}
			
			if(c[j]>='A' && c[j]<='Z') {
				j--;
			}
			
			if((c[j]>='a' && c[j]<='z') && (c[i]>='A' && c[i]<='Z') && i<j) {
				char temp = c[i];
				c[i] = c[j];
				c[j] = temp;
				
				i++;
				j--;
			}
		}
		
		
		System.out.println(Arrays.toString(c));
	}

}
