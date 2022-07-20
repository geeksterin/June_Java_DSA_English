package dsa_20th_July_2022;

import java.util.Arrays;

public class ParagCodeSelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {20,3,1,19,6}; // 3 20 1 19 6  // 3 1 20 19 6 ... // 3 1 19 20 6   // 3 1 19 6 20
		int n = a.length;
		
       
        for (int i=0;i<n-1;i++){   // passes n-1
            for(int j=0;j<n-1-i;j++){  // j<n-1-i


                if(a[j]>a[j+1]){
                   int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
                //System.out.println(a[i]);
            }
       
        }
        System.out.println(Arrays.toString(a));
  
    }


}
