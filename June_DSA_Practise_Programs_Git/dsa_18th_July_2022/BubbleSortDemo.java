package dsa_18th_July_2022;

import java.util.Arrays;

public class BubbleSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,2,5,1,3};
		
		 for(int i=0;i<a.length-1;i++){
	            for(int j=0;j<a.length-1-i;j++){
	                if(a[j]>a[j+1]){
	                    //swap
	                    int temp = a[j];
	                    a[j] = a[j+1];
	                    a[j+1] = temp;
	                }
	            }
	            
	            System.out.println((i+1) +" pass : "+Arrays.toString(a));
	        }
	        
	        for(int k=0;k<a.length;k++){
	            System.out.print(a[k]+" ");
	        }
	}

}
