package dsa_15th_sept_2022;

public class MyStackClient {

	public static void main(String[] args) {
		MyStack st = new MyStack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.push(70);

		 System.out.println("poped -> "+st.pop()); 
		 st.display();
		 System.out.println("poped -> "+st.pop()); 
		 st.display();
		 System.out.println("poped -> "+st.pop()); 
		 st.display();
		 System.out.println("poped -> "+st.pop()); 
		 st.display();
		 System.out.println("poped -> "+st.pop()); 
		 st.display();
		 System.out.println("poped -> "+st.pop()); 
		 st.display();
		 
		 st.pop();

		 st.display();
		 
		/*
		 * System.out.println("poped -> "+st.pop());
		 * 
		 * st.display();
		 * 
		 * System.out.println("poped -> "+st.pop()); st.display();
		 * 
		 * System.out.println("poped -> "+st.pop());
		 */

	}

}
