package dsa_22_Sep_2022;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NGELeftIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];
		for (int m = 0; m < size; m++) {
			arr[m] = sc.nextInt();
		}

		sc.close();

		int n = arr.length;
		prevGreater(arr, n);
	}

	static void prevGreater(int arr[], int n) {
		// Create a stack and push
		// index of first element
		// to it
		Stack<Integer> s = new Stack<Integer>();
		s.push(arr[0]);
		System.out.print("-1 ");

		for (int i = 1; i < n; i++) {

			// Pop elements from stack
			// while stack is not empty
			// and top of stack is smaller
			// than arr[i]. We always have
			// elements in decreasing order
			// in a stack.
			while (s.empty() == false && s.peek() < arr[i])
			{
				s.pop();
			}
			// If stack becomes empty, then
			// no element is greater on left
			// side. Else top of stack is
			// previous greater.
			if (s.empty() == true)
			{
				System.out.print("-1 ");
			}
			else
			{
				System.out.print(s.peek() + " ");
			}

			s.push(arr[i]);
		}
	}

}