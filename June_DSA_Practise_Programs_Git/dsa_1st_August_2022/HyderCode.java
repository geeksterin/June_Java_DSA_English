package dsa_1st_August_2022;

import java.util.Arrays;
import java.util.Scanner;

public class HyderCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc= new Scanner(System.in);
	        int m=sc.nextInt();
	        int n=sc.nextInt();
	        
	        int [][] a= new int[m][n];
	        
	        for(int i=0;i<m;i++){
	            for(int j=0;j<n;j++){
	                a[i][j]=sc.nextInt();
	            }
	        }
	             int temp[]=new int[m*n];
	            int k=0;
	            for(int i=0;i<m;i++){
	                for(int j=0;j<n;j++){
	                    temp[k]=a[i][j];
	                    k++;
	                    
	                }
	            }
	            Arrays.sort(temp);
	            
	            System.out.println(Arrays.toString(temp));
	            int p=0;
	            for(int i=0;i<m;i++){
	                for(int j=0;j<n;j++){
	                    a[i][j]=temp[p];
	                    p++;
	                }
	            }
	            
	            for(int i=0;i<m;i++){
	                for(int j=0;j<n;j++){
	                    System.out.print(a[i][j]+" ");
	                }
	                System.out.println();
	            }
	        }

	}


