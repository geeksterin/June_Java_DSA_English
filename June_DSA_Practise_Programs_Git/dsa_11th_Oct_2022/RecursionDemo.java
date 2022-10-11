package dsa_11th_Oct_2022;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1;
		print(x);
	}
	
	public static void print(int x) {
		
		if(x>3) {
			return;
		}
		
		System.out.println(x);
		print(++x);
		//System.out.println("print --> "+x);
		
	}

}
