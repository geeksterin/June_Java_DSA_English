package dsa_4th_Aug_2022;

public class TejasCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "welcome to the redzone";

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
