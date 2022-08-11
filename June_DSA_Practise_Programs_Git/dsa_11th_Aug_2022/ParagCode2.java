package dsa_11th_Aug_2022;

public class ParagCode2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc1d8e8g8g7g2g5g";
		int sum = 0;
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (c >= '0' && c <= '9') {
				int num = Integer.parseInt(c + "");
				sum = sum + num;
			}
		}
		System.out.println(sum);
	}

}
