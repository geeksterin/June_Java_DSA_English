package dsa_24th_June_2022;

public class FindFirst7tersmsforEquation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findTerms();
	}

	 static void findTerms() {

		 int counter = 0;
		 int i =1;
		 
		 while(counter<7) {
			 if((i*6*i)%6 == 0) {
				 System.out.println(i);
				 counter++; 
			 }
			 
			 i++;
		 }
	}

}
