package dsa_23rd_July_2022;

import java.util.Scanner;

public class SearchIn2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	        int m = sc.nextInt();

	        int n = sc.nextInt();
	        
	        int a[][] = new int[m][n];

	        for(int i=0;i<m;i++) {
	            for(int j=0;j<n;j++) {
	                a[i][j] = sc.nextInt();
	            }
	        }
	        
	        
	        int x = sc.nextInt();
	        
	        sc.close();

	        
	        boolean found = false;
	        
	          for(int i=0;i<m;i++) {
	            for(int j=0;j<n;j++) {
	                if(a[i][j] == x){
	                   found = true;
	                    break;
	                } 
	            }
	              
	              if(found == true){
	                    break;
	                }
	        }
	        
	        if(found == false){
	            System.out.println("No");
	        }
	        
	        else{
	             System.out.println("Yes");
	        }
	        
	}

}
