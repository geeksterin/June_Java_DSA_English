package dsa_8th_Oct_2022;

public class LinkedListDemo {

	static Node head = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * addLast(10); display();
		 * 
		 * addLast(15); display();
		 * 
		 * addLast(30); display();
		 * 
		 * 
		 * deleteFirst(); display();
		 * 
		 * 
		 * deleteLast(); display();
		 * 
		 * deleteLast(); display();
		 * 
		 * deleteLast(); display();
		 * 
		 * deleteLast();
		 */
		
		int a[] = {1,4,5,9};
		
		for(int i=0;i<a.length;i++) {
			addLast(a[i]);
		}
		
		display();

	}

	private static void deleteLast() {
		if (head == null) {
			System.out.println("List is empty!");
		}

		else if (head.next == null) {
			head = null;
		}

		else {
			Node prev = head;
			Node cur = head.next;

			while (cur.next != null) {
				cur = cur.next;
				prev = prev.next;
			}

			prev.next = null;
		}

	}

	private static void deleteFirst() {
		if (head == null) {
			System.out.println("Linkedlist is empty!");
		}

		else {
			Node temp = head.next;
			head.next = null;
			head = temp;
		}
	}

	public static void addFirst(int data) {

		Node n = new Node(data);
		// if list is empty or not
		// if head is pointing to null -> list is empty

		if (head == null) {
			head = n;
		}

		else {
			n.next = head;
			head = n;
		}

	}

	public static void display() {

		if (head == null) {
			System.out.println("List is empty!");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}

			System.out.println();
		}

	}

	public static void addLast(int data) {

		Node n = new Node(data);

		if (head == null) {
			head = n;
		}

		else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}

			temp.next = n;
		}
	}

}
