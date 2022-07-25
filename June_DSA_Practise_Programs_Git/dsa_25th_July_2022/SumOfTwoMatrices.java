package dsa_25th_July_2022;

import java.util.Scanner;

public class SumOfTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s = new Scanner(System.in);
	        
	        int m1 = s.nextInt();
	        int n1 = s.nextInt();
	        
	        int a[][] = new int[m1][n1];
	        
	        for(int i=0;i<m1;i++) {
	            for(int j=0;j<n1;j++) {
	                a[i][j] = s.nextInt();
	            }
	        }
	        
	        int m2 = s.nextInt();
	        int n2 = s.nextInt();
	        
	        int b[][] = new int[m2][n2];
	        
	        for(int i=0;i<m2;i++) {
	            for(int j=0;j<n2;j++) {
	                b[i][j] = s.nextInt();
	            }
	        }
	        
	        s.close();
	        
	        
	        if(m1==m2 && n1==n2)
	        {
	               for(int i=0;i<m2;i++) {
	            for(int j=0;j<n2;j++) {
	                int sum = a[i][j] +b[i][j];
	                System.out.print(sum+" ");
	            }
	            
	            System.out.println();
	        }
	        }
	        
	        else{
	         System.out.println("-1");

	        }
	}

}
