package dsa_22_Sep_2022;

import java.io.*;
import java.util.*;

public class AbhishekCode {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(arr[0]);
		
		System.out.print("-1 ");
		
		for (int i = 1; i < n; i++) {
			while (s.empty() == false && s.peek() < arr[i]) {
				s.pop();
			}
			if (s.empty() == true) {
				System.out.print("-1 ");
			} else {
				System.out.print(s.peek() + " ");
			}

			s.push(arr[i]);
		}
	}
}
