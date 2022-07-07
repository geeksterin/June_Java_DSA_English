package dsa_7th_July_2022;

public class CheckIfSortedArrayContainsDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,22,25,35,56,59,78};
		
		boolean flag = false;
		
		for(int i =0;i<a.length-1;i++) {
			if(a[i]==a[i+1]) {
				flag = true;
				break;
			}
		}
		
		
		if(flag==true) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
	}

}
