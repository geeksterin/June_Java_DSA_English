package dsa_17th_Sept_2022;

import java.util.ArrayList;

public class MyStackAL {

	ArrayList<Integer> a = new ArrayList<>();	
	
	void push(int x) {
		a.add(x);
	}
	
	int pop(){
		
		if(a.size()==0) {
			System.out.println("Stack underflow");
			
			return -1;
		}
		
		else {
			return a.remove(a.size()-1);
		}
	
	}
	
	void display() {
		System.out.println("Displaying contents :: ");
		
		for(int x : a) {
			System.out.println(x);
		}
		
		
	}
	
	int peek() {
		
		if(a.size()==0) {
			System.out.println("stack is empty!");
			return -1;
		}
		
		else {
			return a.get(a.size()-1);
		}
		
	}

}




	

