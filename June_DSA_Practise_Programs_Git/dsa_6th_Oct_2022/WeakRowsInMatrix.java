package dsa_6th_Oct_2022;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class WeakRowsInMatrix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int a[][] = new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j] = sc.nextInt();
            }
        }
        
        sc.close();
        
        Map<Integer,Integer> map = new HashMap<>();
        
         for(int i=0;i<m;i++){
             int count = 0;
            for(int j=0;j<n;j++){
                if(a[i][j] == 1){
                    count++;
                }
            }
             map.put(i,count); 
        }
        

         List<Entry<Integer,Integer>> li = new ArrayList<>();
        li.addAll(map.entrySet());
        
        MyComparator mc = new MyComparator();
        Collections.sort(li,mc);
        
        
        for(int i=0;i<k;i++) {
            Entry<Integer,Integer> e = li.get(i);
            System.out.print(e.getKey()+" ");
        }
            
    }
}

 class MyComparator implements Comparator<Entry<Integer,Integer>>{

    @Override
    public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
      return o1.getValue()-o2.getValue();
    }

}
    