package dsa_7th_Oct_2022;

public class LinkedListDemo {

	static Node head = null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		addFirst(10);
		display();
		
		addFirst(50);
		display();
		
		addFirst(100);
		display();
		
		addFirst(456);
		display();
		
	}
	
	public static void addFirst(int data) {
		
		Node n = new Node(data);
		//if list is empty or not
		// if head is pointing to null -> list is empty
		
		if(head==null) {
			head = n;
		}
		
		else {
			n.next = head;
			head = n;
		}
		
	}
	
	public static void display() {
		
		if(head ==null) {
			System.out.println("List is empty!");
		}
		else {
			Node temp = head;
			while(temp!=null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			
			System.out.println();
		}
		
	}

}
