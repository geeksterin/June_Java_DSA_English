package dsa_21st_Sept_2022;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();

		sc.nextLine();

		String[] ops = new String[Q];
		for (int i = 0; i < Q; i++) {
			ops[i] = sc.nextLine();
		}

		Stack<String> st = new Stack<>();

		String s = "";

		for (int i = 0; i < ops.length; i++) {

			String operation = ops[i];

			String[] splitArr = operation.split(" ");
			String op = splitArr[0]; // opeartion num
			int oper = Integer.parseInt(op);

			if (splitArr.length > 1) {
				String parameter = splitArr[1];

				if (oper == 1) {
					// append
					String peekedVal = (st.size()>0?st.peek():s);
					String res = peekedVal + parameter;
					st.push(res);
					//System.out.println("Operation 1 complete : "+st);

				}
				if (oper == 2) {
					int k = Integer.parseInt(parameter);
					String peekedVal = st.peek();
					//System.out.println("Operation 2 peekedVal : "+peekedVal);

					if (k <= peekedVal.length()) {
						String res = peekedVal.substring(0, peekedVal.length() - k);
					//	System.out.println("res : "+res);

						st.push(res);
						//System.out.println("Operation 1 complete : "+st);

					}
				}
				if (oper == 3) {
					int k = Integer.parseInt(parameter);
					String peekedVal = st.peek();
					System.out.println(peekedVal.charAt(k - 1));
					//System.out.println("Operation 3 complete : "+st);


				}
			}

			// operation 4
			else {
				st.pop();
				//System.out.println(st);

			}
		}

	}

}
