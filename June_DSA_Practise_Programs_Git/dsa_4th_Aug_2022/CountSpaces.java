package dsa_4th_Aug_2022;

public class CountSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Welcome";
		
		int count = 0;
		for(int i =0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch==' ') {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
