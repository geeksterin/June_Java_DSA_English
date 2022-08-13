package dsa_13th_Aug_2022;

public class CountTheLengthOfSubStringsWithGivenSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "abcd";
		int len = 3;

		int count = 0;

		for (int i = 0; i < s1.length(); i++) {
			for (int j = i ; j < s1.length(); j++) {
				int subLen = j+1-i;
				if(subLen == len) {
					count++;
				}
			}
		}

		System.out.println(count);
	}

}
