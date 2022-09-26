package dsa_26th_Sept_2022;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindFirstUniqueCharacter {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (map.containsKey(ch)) {
				int c = map.get(ch);
				map.put(ch, c + 1);
			}

			else {
				map.put(ch, 1);
			}
		}

		int ind = -1;
		for (int k = 0; k < s.length(); k++) {
			if (map.get(s.charAt(k)) == 1) {
				ind = k;
				break;
			}
		}

		System.out.println(ind);

	}
}