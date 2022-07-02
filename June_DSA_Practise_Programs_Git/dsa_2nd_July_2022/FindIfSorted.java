package dsa_2nd_July_2022;

import java.util.Scanner;

public class FindIfSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        int a[] = new int[N];
        
        if(N<=0){
                 System.out.println("No");
                return;
        }
        
        for(int i=0;i<N;i++){
           a[i] =  s.nextInt();
        }
        
        s.close();
        
        boolean sorted = true;
        for(int i =0;i<a.length-1;i++){
            if(!(a[i+1] >= a[i])){
                sorted = false;
                break;
            }
        }
    
    if(sorted == true){
        System.out.println("Yes");
    }
    
    else{
     System.out.println("No");

    }
	    
	}

}
