package dsa_15th_July_2022;

import java.util.Scanner;

public class FindTheFirstSmallestMissingPositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        
        int max = a[0];
        
        for(int i=1;i<a.length;i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }
        
        //System.out.println(max);
        
        if(max<0) {
            System.out.println(1);
            return;
        }
        
        else {
            //there are positive numbers
            // find the first positive number which is missing
            // Run a loop from 1 to max and see which number is missing first
            
            
            for(int i=1;i<=max+1;i++) { // checking nums from 1 to max
                
                boolean found = false;
                
                for(int j=0;j<a.length;j++) { // search the i num in the array
                    if(a[j]==i) {
                        found = true;
                        break;
                    }
                }
                
                if(found == false) {
                    System.out.println(i);
                    break;
                }
            }
        }
	}

}



