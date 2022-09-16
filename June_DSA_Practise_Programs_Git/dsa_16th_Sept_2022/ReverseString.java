package dsa_16th_Sept_2022;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        
        String temp = "";
        for(int i=0;i<s.length();i++){  
            temp = temp + st.pop();  
        }
        
        System.out.println(temp);
	}

}
