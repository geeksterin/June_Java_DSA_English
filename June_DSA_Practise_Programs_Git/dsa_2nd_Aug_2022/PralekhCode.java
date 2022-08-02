package dsa_2nd_Aug_2022;

import java.util.Arrays;
import java.util.Scanner;

public class PralekhCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
	System.out.println(Arrays.deepToString(a));
	
	
		int pi=-1,pj=-1;
		int ri=-1,rj=-1;
		for(int i=0;i<r;i++)
		{
			
			for(int j=0;j<c;j++)
			{
				if(i==j)
				{
					System.out.println(a[i][j]+" ");
					pi=i;
					pj=j;
				}
				if(i+j==r-1)
				{
					System.out.println(a[i][j]+" ");
					ri=i;
					rj=j;
				}
				
			}
			int temp=a[pi][pj];
			a[pi][pj]=a[ri][rj];
			a[ri][rj]=temp;
			
		}
			System.out.println();
			System.out.println(Arrays.deepToString(a));
	}

}
