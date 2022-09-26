package dsa_26th_Sept_2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindUniqueFrequency2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        Map<Integer,Integer> mp1=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
            if(mp1.containsKey(a[i]))
        {
            mp1.put(a[i], mp1.get(a[i]) + 1);
        }else
        {
            mp1.put(a[i], 1);
        }
            
        }
        sc.close();
        Map<Integer,Integer> mp2=new HashMap<>();
        boolean flag=true;
        for(int key :mp1.keySet())
        {
            int val=mp1.get(key);
            if(mp2.containsKey(val))
            {
                flag=false;
            }
            else
            {
                mp2.put(val,key);
            }
        }
        System.out.println(flag);

	}

}
