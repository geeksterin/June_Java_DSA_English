package dsa_6th_Aug_2022;

public class ReverseOnlyTheGivenWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Welcome to programming concepts";
		String target = "Welcome";
		
		
		String[] sp = s1.split(" ");
		String temp = "";
		
		for(int i=0;i<sp.length;i++) {
			String val = sp[i];
			
			//If target found reverse the word and then add to temp
			if(val.equals(target)) {
				String rev = "";
				
				for(int j =val.length()-1;j>=0;j--) {
					rev = rev + val.charAt(j);
				}
				
				temp = temp + rev+" ";
				
			}
			
			//Its not target, put it as is on temp
			else {
				
				temp = temp + val+ " ";
				
			}
		}
		
		System.out.println(temp);
		
	}

}
