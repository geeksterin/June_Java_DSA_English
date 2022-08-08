package dsa_8th_Aug_2022;

public class RohitCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Hello world this is first java program";
		String s2 = "world";
		String[] a = s1.split(" ");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(s2))
			{
				//System.out.println(a[i]);
				
				System.out.println("Hello!!!!");
				count++;
			}
		}
		System.out.println(count);

	}
}
