package dsa_8th_Aug_2022;

public class FindThePalindomeCountInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Today mam taught us Malayalam";
		
		s1 = s1.toLowerCase();
		
		String[] a = s1.split(" ");
		
		int count =0;
		
		for(int i=0;i<a.length;i++) {
			String word = a[i];
			
			String temp = "";
			for(int j=word.length()-1;j>=0;j--) {
				temp = temp + word.charAt(j);
			}
			
			if(word.equals(temp)) {
				count++;
			}
		}
		
		
		System.out.println(count);
		
		
	}

}
