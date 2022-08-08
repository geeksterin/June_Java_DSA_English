package dsa_8th_Aug_2022;

public class PradeepCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "I am at ease";

		String[] a = s.split(" ");
		
		for (int i = 0; i < a.length; i++) {
			String s1 = a[i];
			String rev = "";
			for (int j = s1.length()-1; j >= 0; j--) {
				rev = rev + s1.charAt(j);
			}
			
			System.out.print(rev +" ");
		}
		/*
		 * for (int k = 0; k < a.length; k++) { System.out.print(a[k] + " ");
		 * 
		 * }
		 */
	}

}
