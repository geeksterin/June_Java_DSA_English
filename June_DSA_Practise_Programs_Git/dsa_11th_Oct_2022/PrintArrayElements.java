package dsa_11th_Oct_2022;

public class PrintArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,12,17,19};
		
		int x = 0;
		
		print(x,a);
	}

	private static void print(int x, int[] a) {

		if(x==a.length) {
			return;
		}
		
		System.out.println(a[x]);
		
		print(++x,a);
	}

}
