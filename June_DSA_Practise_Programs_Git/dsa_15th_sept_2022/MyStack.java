package dsa_15th_sept_2022;

public class MyStack {

	int size = 6;
	int a[] = new int[size];
	int top = -1;
	
	
	void push(int x) {

		if(top == size-1) {
			System.out.println("Stack overflow!");
		}
		
		else {
			a[++top] = x;
		}
		

	}
	
	int pop(){
		
		if(top==-1) {
			System.out.println("Stack underflow");
			
			return -1;
		}
		
		else {
			int temp = a[top];
			top--;
			return temp;
		}
	
	}
	
	void display() {
		System.out.println("Displaying contents :: ");

		
		for(int i=0;i<=top;i++) {
			System.out.println(a[i]);
		}
	}
}
