package dsa_30thSept_2022;

public class MyQueue {

	int size = 5;
	int a[] = new int[size];
	int rear = -1;
	
	void add(int x) {
		if(rear == size-1) {
			System.out.println("Queue is full");
		}
		else {
			a[++rear] = x;
		}
	}
	
	int peek() {
		if(rear==-1) {
			System.out.println("Queue is empty!");
			return -1;
		}
		else {
			return a[0];
		}
	}
	
	int remove() {
		if(rear==-1) {
			System.out.println("Queue is empty!");
			return -1;
		}
		
		else {
			int temp = a[0];
			
			for(int i=0;i<rear;i++) {
				a[i] = a[i+1];
			}
			
			rear--;
			
			return temp;
		}
	}
	
	
	
	void display() {
		if(rear==-1) {
			System.out.println("Queue is empty!");
		}
		else {
			for(int i=0;i<=rear;i++) {
				System.out.print(a[i]+ " ");
			}
		}
		
		System.out.println();
	}
	
	
	
	
}
