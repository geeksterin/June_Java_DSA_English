package dsa_16th_Sept_2022;

import java.util.Scanner;

public class ShivamCode {
	int top = -1;
	Scanner sc = new Scanner(System.in);

	int size = sc.nextInt();
	int a[] = new int[size];

	public static void main(String[] args) {

		ShivamCode st = new ShivamCode();

		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.display();
		System.out.println("popped ele"+st.pop());
		System.out.println("popped ele"+st.pop());
		System.out.println("After Pop");
		st.display();
	}

	void push(int x) {

		if (top == size - 1) {
			System.out.println("Stack OverFlow");
		} else {
			a[++top] = x;

		}
	}

	int pop() {
		if (top == -1) {
			System.out.println("Stack UnderFlow");
			return -1;
		}

		else {
			int temp = a[top];
			top--;
			return temp;
		}
	}

	void display() {
		for (int i = 0; i <= top; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
	}

}
