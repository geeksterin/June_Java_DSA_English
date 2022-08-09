package dsa_9th_August_2022;

public class MilindCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "The first man to land on the moon was Neil ArmStrong";
		int c = 1;
		for (int i = 1; i < s.length(); i++) {
			for (int j = 0; j < i; j++) {

				if (s.charAt(i) == s.charAt(j)) {

					break;
				} else if (i - 1 == j) {
					c++;
				}
				if (c == 26) {
					break;
				}
			}
			if (c == 26) {
				break;
			}

		}
		if (c == 26) {
			System.out.println(c);
			System.out.println("Yes");
		} else {
			System.out.println(c);
			System.out.println("No");
		}
	}

}
