package dsa_6th_July_2022;

public class PrintNumbersfromLastStartTraversingFromBeginning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10, 20, 30, 40, 50 }; // 0,1,2,3,4


		for (int i = 0; i < a.length; i++) { // 0,1,2,3 
			int ind = a.length-1-i;
			System.out.println(a[ind]);
		}

	}

}
