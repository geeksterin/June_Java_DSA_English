package dsa_6th_July_2022;

public class FindFirstOccurenceOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 10,3,5,10,4,7,10};
		int target = 10;
		int index =-1;
		
		for(int i=0;i<a.length;i++) {
			if(a[i] == target) {
				index = i;
				break;
			}
		}
		
		System.out.println(index);
	}

}
