package dsa_17th_Sept_2022;

import java.util.Scanner;
import java.util.Stack;

public class DeleteConsecutiveStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        sc.nextLine();
	        
	        Stack<String> st = new Stack<>();
	        for(int i=0;i<N;i++) {
	            String s = sc.next();
	            
	            if(st.isEmpty()==false && st.peek().equals(s)){
	                st.pop();
	            }
	            
	            else{
	                st.push(s);
	            }
	        }
	        
	        System.out.println(st.size());
	}

}
