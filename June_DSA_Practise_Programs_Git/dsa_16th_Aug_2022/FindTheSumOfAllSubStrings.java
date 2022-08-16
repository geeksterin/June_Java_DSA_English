package dsa_16th_Aug_2022;

public class FindTheSumOfAllSubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "1234";

		int sum = 0;

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i; j < s1.length(); j++) {
				String temp = s1.substring(i, j + 1);
				int x = Integer.parseInt(temp);

				sum = sum + x;
			}
		}

		 System.out.println(sum);
	}

}
