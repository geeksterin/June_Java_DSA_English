package dsa_29th_aug_2022;

public class FindUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 3, 3, 3, 4 };
		
		if(a[0]!=a[1]) {
			System.out.println(a[0]);

		}
		
		for(int i=1;i<a.length;i++) {
			if(a[i]!=a[i-1]) {
				System.out.println(a[i]);
			}
		}
	}

}
