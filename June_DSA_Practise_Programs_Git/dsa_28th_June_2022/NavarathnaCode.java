package dsa_28th_June_2022;

import java.util.Scanner;

import java.util.Scanner;

public class NavarathnaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j==1){
                    System.out.print("*");
                }
                else if(j<=i){
                    System.out.print("**");
                    }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}

}
