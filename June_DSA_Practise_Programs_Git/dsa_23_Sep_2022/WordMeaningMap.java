package dsa_23_Sep_2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordMeaningMap {
	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner sc = new Scanner(System.in);
	        
	        Map<String,String> mp = new HashMap<>();
	        
	        int x = 1;
	        
	        while(x==1){
	            int oper = sc.nextInt();
	        
	        if(oper == 1){
	            String key = sc.next();
	            String value = sc.next();
	            mp.put(key,value);
	        }
	        
	        else if(oper == 2){
	            String key = sc.next();
	            
	            if(mp.containsKey(key)){
	                System.out.println(mp.get(key));
	            }
	            else{
	                System.out.println(-1);
	            }

	        }
	        
	        else if(oper == 3){
	            String key = sc.next();
	            
	            mp.remove(key);

	        }
	        
	        else if(oper == 4){
	            x=0;
	        }
	        
	        }
	        
	    }
}
