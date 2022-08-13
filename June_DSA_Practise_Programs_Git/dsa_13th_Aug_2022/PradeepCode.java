package dsa_13th_Aug_2022;

public class PradeepCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abc";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String s1 = s.substring(i, j);

				if (s1.length() == 3) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
