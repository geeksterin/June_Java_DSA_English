package dsa_22_Aug_2022;

public class BilalCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;  // 1010 >> 5 -> 0
		
		
		for (int pos = 31; pos >= 0; pos--)

			System.out.println(num >>pos &1);
	}

}
