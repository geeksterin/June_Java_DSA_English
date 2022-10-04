package dsa_4th_Oct_2022;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BreakStone {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        for(int i=0;i<N;i++){
            pq.add(sc.nextInt());
        }
        
        while(pq.size()>1){
            int y = pq.poll();
            int x = pq.poll();
            
            if(x!=y){
                y = y-x;
                pq.add(y);
            }
            
        }
        
        if(pq.size()==0){
         System.out.println(0);

        }
        else{
        System.out.println(pq.peek());

        }
        
    
}
}