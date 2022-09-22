package dsa_22_Sep_2022;

import java.util.Stack;

public class StockPlanner {


	public static void main(String args[]) {
		int a[] = { 100, 80, 60, 70, 60, 75, 85 };

		Stack<Integer> st = new Stack<>();
		Stack<Integer> span = new Stack<>();

		for (int i = 0; i < a.length; i++) {
			int ans = 1;

			while (st.size() != 0 && a[i] >= st.peek()) {
				st.pop();
				ans = ans + span.pop();
			}
			
			span.add(ans);
			st.push(a[i]);
			
			System.out.print(ans + " ");
		}
	}
}
