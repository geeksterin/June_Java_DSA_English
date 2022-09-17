package dsa_17th_Sept_2022;

public class MyStackALDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStackAL st = new MyStackAL();
		st.push(10);
		st.push(20);
		st.push(30);
		
		System.out.println(st.peek());
		System.out.println(st.pop());
		
		st.display();
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.pop());


	}

}
