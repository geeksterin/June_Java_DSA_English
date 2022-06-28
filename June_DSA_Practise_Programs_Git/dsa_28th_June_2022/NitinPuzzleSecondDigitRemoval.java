package dsa_28th_June_2022;

public class NitinPuzzleSecondDigitRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5670;
		String s = String.valueOf(num);
		
		System.out.println(s);
		while(s.length()!=1)
		{
			
			s = printAndReduce(s);
			System.out.println(s);
		}
	}

	private static String printAndReduce(String s) {
	
		String temp = "";
		for(int i =0;i<s.length();i++) {
			if(i!=1) {
				temp += s.charAt(i);
			}
		}
		
		return temp;
				
	}

}
