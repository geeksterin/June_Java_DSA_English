package dsa_9th_August_2022;

public class AbhishekCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello";
		String str1 = str.toLowerCase();
		int temp[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str1.charAt(i);
			int index = ch - 'a';
			temp[index] = temp[index] + 1;
		}
		
		boolean pangram = true;

		for (int i = 0; i < 26; i++) {
			if (temp[i] == 0) {
				pangram = false;
				break;
			}
		}
		
		System.out.println(pangram);
	}

}
