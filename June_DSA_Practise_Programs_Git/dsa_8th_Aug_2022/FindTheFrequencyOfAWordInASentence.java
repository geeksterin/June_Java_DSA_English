package dsa_8th_Aug_2022;

public class FindTheFrequencyOfAWordInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "welcome to the world of programming. The world, is so small.";
		String s2 = "World";
		
		String[] a = s1.split(" ");
		int count = 0;
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i].contains(s2)) {
				count++;
			}
		}
		
		System.out.println(count);
		
	}

}
