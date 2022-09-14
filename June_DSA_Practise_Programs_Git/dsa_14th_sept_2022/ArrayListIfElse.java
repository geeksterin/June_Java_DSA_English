package dsa_14th_sept_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListIfElse {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			boolean isValid = true;

			int x = sc.nextInt();

			// case 1
			//System.out.println(li.size());

			// case 2
			if (li.size() == 0) {
				isValid = false;
			} else {
				//System.out.println(li.get(li.size() - 1));
				li.remove(li.size() - 1);
			}

			// case 3
			//System.out.println(x);
			li.add(x);

			// case 4
			if (li.size() == 0) {
				isValid = false;
			} else {
				//System.out.println(li.get(0));
				li.remove(0);
			}

			// case 5
			//System.out.println(x);
			li.add(0, x);

			// case 6
			if (li.size() == 0) {
				isValid = false;
			}
			else{
				for (Integer m : li) {
			
					System.out.print(m + " ");
				}
			}

			System.out.println("li contents "+li);
			if(isValid == false) {
				System.out.println("invalid move");
			}
		}

	}
}
