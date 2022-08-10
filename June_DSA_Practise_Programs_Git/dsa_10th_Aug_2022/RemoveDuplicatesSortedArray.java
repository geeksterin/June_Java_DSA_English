package dsa_10th_Aug_2022;

public class RemoveDuplicatesSortedArray {

	public static void main(String[] args) {

		String s1 = "abcdddef";
		String temp = s1.charAt(0) + "";

		char[] c = s1.toCharArray();

		for (int i = 1; i < c.length; i++) {
			if (c[i] != c[i - 1]) {
				temp = temp + c[i];
			}
		}

		System.out.println(temp);

	}

	public static void m1() {

		// TODO Auto-generated method stub

		String s1 = "abcddd";
		String temp = "";

		char[] c = s1.toCharArray();

		for (int i = 0; i < c.length - 1; i++) {
			if (c[i] == c[i + 1]) {

			}

			else {
				temp = temp + c[i];
			}
		}

		if (c[c.length - 1] != c[c.length - 2]) {
			temp = temp + c[c.length - 1];
		}

		System.out.println(temp);

	}

}
