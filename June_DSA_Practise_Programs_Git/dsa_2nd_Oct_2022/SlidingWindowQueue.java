package dsa_2nd_Oct_2022;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SlidingWindowQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int k = sc.nextInt();
		
		int a[] = new int[N];
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=0;i<N;i++) {
			a[i] = sc.nextInt();
		}
		
		
		int j =0; //window number
		
		for(int i=0;i<N;i++) {
			if(a[i]<0) {
				q.add(a[i]);
			}
			
			//reached end of window, do calculation and slide window
			if(i-j+1 == k) {
				if(q.isEmpty()) {
					System.out.print(0+ " ");
				}
				
				else {
					int p = q.peek();
					System.out.print(p+ " ");
					
					//remove the element provided if it is the first element of the window
					//If the element is not the first element of the window, then we need that element for computing next window, do dont delete
					
					if(p==a[j]) {
						q.remove();
					}
				}
				
				j++; // done with current window, hence go to next window
			}
		}

	}

}
