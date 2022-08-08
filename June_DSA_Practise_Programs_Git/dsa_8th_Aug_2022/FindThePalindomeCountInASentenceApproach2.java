package dsa_8th_Aug_2022;

public class FindThePalindomeCountInASentenceApproach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Today mam taught us Malayalam";
		
		s1 = s1.toLowerCase();
		
		String[] a = s1.split(" ");
		
		int count =0;
		
		for(int i=0;i<a.length;i++) {
			String word = a[i];
			
			int j = 0;
			int k = word.length()-1;
			boolean flag = true;
			
			while(j<k) {
				
				if(word.charAt(j)!=word.charAt(k)) {
					flag = false;
					break;
				}
				
				j++;
				k--;
			}
			
			if(flag== true) {
				count++;
			}
		}
		
		
		System.out.println(count);
		
		
	}

}
