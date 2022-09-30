package dsa_30thSept_2022;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueSyntaxhackerRankQuestion {

	public static void main(String a[]) {
		 Scanner sc=new Scanner(System.in);
	        Queue<Integer> q=new LinkedList<>();
	        int n=sc.nextInt();
	        for(int i=1;i<=n;i++){
	            int x=sc.nextInt();
	            if(x==1){
	                System.out.println(q.size());
	            }
	            else if(x==2){
	                if(!q.isEmpty()){
	                    q.remove();
	                }
	                else{
	                    System.out.println(-1);
	                }
	            }
	            else if(x==3){
	                int s=sc.nextInt();
	                q.add(s);
	            }
	            else{
	                if(!q.isEmpty()){
	                   System.out.println(q.peek());
	                }
	                else{
	                    System.out.println(-1);
	                }
	            }
	        }

	}
}
