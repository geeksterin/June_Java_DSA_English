package dsa_9th_Oct_2022;

import java.util.Scanner;

public class LinkedListDemo {

	static Node head = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int a[] = new int[N];

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			addLast(a[i]);
		}
		
		//int k = sc.nextInt();
		
		int count = getCount();
		
		System.out.println(count);
		
		int mid = (count/2) + 1;
		int ans = getMiddleElement(mid);
		System.out.println(ans);
		
		//int num = findFirstEvenNumber();
		//System.out.println("First even num is " +num);

		//int num = findTheNumberAtGivenIndex(k);
		//System.out.println(num);
		
		//display();
		
		//insertNewNodeAfterkthPosition(10,70);
		//display();

	}

	private static int getMiddleElement(int mid) {
		int num = -1;
		int c = 1;

		if (head == null) {
			System.out.println("List is empty!");
		} else {
			Node temp = head;
			while (temp != null) {
				if(c==mid) {
					num = temp.data;
					break;
				}
				c++;
				temp = temp.next;
			}

			System.out.println();
		}

		return num;
	
	}

	private static int findTheNumberAtGivenIndex(int k) {

		int num = -1;
		int c = 0;
		
		if (head == null) {
			System.out.println("List is empty!");
		} else {
			Node temp = head;
			while (temp != null) {
				if(c==k) {
					num = temp.data;
					break;
				}
				c++;
				temp = temp.next;
			}

			System.out.println();
		}

		return num; 
	
	}
	
	private static int insertNewNodeAfterkthPosition(int k, int data) {

		Node n = new Node(data);
		
		int num = -1;
		int c = 0;
		
		if (head == null) {
			System.out.println("List is empty!");
		} else {
			Node temp = head;
			while (temp != null) {
				if(c==k) {
					
					Node p = temp.next;
					temp.next = n;
					n.next = p;
				}
				c++;
				temp = temp.next;
			}

			System.out.println();
		}

		return num; 
	
	}


	private static int findFirstEvenNumber() {

		int num = -1;
		
		if (head == null) {
			System.out.println("List is empty!");
		} else {
			Node temp = head;
			while (temp != null) {
				
				if(temp.data%2==0) {
					num = temp.data;
					break;
				}
				temp = temp.next;
			}

			System.out.println();
		}

	
		return num;
	}

	private static int getCount() {
		
		int count = 0;
		if (head == null) {
			System.out.println("List is empty!");
		} else {
			Node temp = head;
			while (temp != null) {
				count++;
				//System.out.print(temp.data + " ");
				temp = temp.next;
			}

			//System.out.println();
		}

		return count;
	
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
