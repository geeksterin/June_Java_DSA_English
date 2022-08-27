package dsa_27th_Aug_2022;

public class FindTheOnlyUniqueElementWhereAllAreTwiceRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,4,2,4,1,9};
		
		int xor = 0;
		for(int i=0;i<a.length;i++) {
			xor = xor ^ a[i];
		}
		
		System.out.println(xor);
		
		
	}

}
