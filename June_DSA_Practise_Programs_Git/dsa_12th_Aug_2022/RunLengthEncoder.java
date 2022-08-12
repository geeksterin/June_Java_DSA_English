package dsa_12th_Aug_2022;

public class RunLengthEncoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "aabc"; //a2b1c1
		
		if(s1.length()>=1) {
			
			String temp = s1.charAt(0)+""; // a
			int count = 1;
			
			for(int i=1;i<s1.length();i++) {
				
				//if adjacent characters are same, then increamt the count
				if(s1.charAt(i)==s1.charAt(i-1)) {
					count ++;
				}
				
				//when adjacent characters are different, you can add the count value in the temp for the previous character
				else {
					
					temp = temp + count; //a2
					count = 1; // encountered new character, hence set the count to 1
					temp = temp + s1.charAt(i); // after a, we have found b. So it will be a2b
					
				}
				

			}
			
			
			temp = temp + count;
			
			System.out.println(temp);

			
		}
		
		else {
			System.out.println("Invalid input!");
		}
	}

}
