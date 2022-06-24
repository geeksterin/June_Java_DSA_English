package dsa_24th_June_2022;

public class FindFirst3Terms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		compute();
	}

	 static void compute() {
		
		 int counter = 0;
		 int i =1;
		 
		 while(counter<3) {
			 
			 if((4*i+9)%3 == 0) {
				 System.out.println(i);
				 counter++;
			 }
			 
			 i++;
		 }
	}

}
