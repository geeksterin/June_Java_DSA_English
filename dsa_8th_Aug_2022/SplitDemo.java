package dsa_8th_Aug_2022;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "This is the session";
		String[] a = s1.split("the");
		
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		
	}

}
