package dsa_19th_July_2022;

import java.util.Arrays;

public class SortByParity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {0,1};
		
		 int i = 0;
	        int j = a.length-1;
	        
	        while(i<j){
	            if(a[i]%2==0){
	                i++;
	            }
	            
	              if(a[j]%2!=0){
	                j--;
	            }
	            
	            if(a[i]%2!=0 && a[j]%2==0 && i<j){
	                int temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	                i++;
	                j--;
	            }
	        }
	        
	        System.out.println(Arrays.toString(a));
	        
	}
	
	

}
