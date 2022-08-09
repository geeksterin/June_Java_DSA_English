package dsa_9th_August_2022;

import java.util.Arrays;

public class FrequencyOfAllCharactersInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";
		int temp[] = new int[26]; // at index 0 -> store count of a
		
		for(int i=0;i<s1.length();i++) {
			//get the character present at ith pos
			char ch = s1.charAt(i);
			
			//find the index of the character ch
			// This can be done by subtracting 'a' from character
			// Index char
			// 0   a
			// 1   b
			// 2   c
			
			// 25  z
			int index = ch - 'a';
			temp[index] = temp[index] + 1;
		}
		
	System.out.println(Arrays.toString(temp));
		
		/*
		 * for(int i=0;i<temp.length;i++) {
		 * 
		 * }
		 */
		
		for(int i=0;i<temp.length;i++)
	      {
	          if(temp[i]>0)// it indicates the characters that are present in the string
				{
	        	  
	        	 // temp[i] -> frequency
	        	 // i -> 0 
	        	  
	        	  int val = i+97;  // getting the ascii value of a character , a -> 97, b -> 98
	        	  char ch = (char) val;
	        	  System.out.println("Char : "+ch +" freq : "+temp[i]);
	        	
	          }
	      }

	}

}
