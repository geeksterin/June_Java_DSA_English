package dsa_30thSept_2022;

public class MyQueueImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyQueue q = new MyQueue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		q.display();
		
		q.add(60);
		
		System.out.println(q.peek());
		System.out.println(q.remove());
		
		q.display();

		System.out.println(q.remove());
		q.display();

	}

}
