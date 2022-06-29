package dsa_29th_June_2022;

public class FindANumberInTheArrayApproach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,4,5,98,20,8,20};
		
		int target = 20;
		
		//boolean isPresent = false;
		
		//int temp = 1;
		boolean found = false;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==target) {
				found = true;
				break;
			}
		}
		
		if(found == true) {
			System.out.println("Present");

		}
		else {
			System.out.println("Not present");

		}
		
		
		
	}

}
