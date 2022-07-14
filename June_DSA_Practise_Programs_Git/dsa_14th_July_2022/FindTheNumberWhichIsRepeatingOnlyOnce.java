package dsa_14th_July_2022;

public class FindTheNumberWhichIsRepeatingOnlyOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {7,5,4,3,5,3,4};
		
		int xor = 0;
		for(int i=0;i<a.length;i++) {
			System.out.println("a[i] :: "+a[i]);
			xor = xor ^ a[i]; // 7 ^ 5
			System.out.println("xor :: "+xor);
		}
		
		System.out.println("Appearing only once : "+xor);
	}

}
