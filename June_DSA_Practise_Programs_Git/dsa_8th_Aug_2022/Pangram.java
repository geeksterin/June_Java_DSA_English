package dsa_8th_Aug_2022;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "A quick brown fox jumps over the lazy dog";
		s = s.toLowerCase();
		
		boolean flag = true;
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!s.contains(ch+"")) {
				flag = false;
			}
		}
		
		System.out.println(flag);

	}

}
