package dsa_6th_July_2022;

public class FindFirstAndLastOccurenceIfANumInOneTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10,20,10,40,10};
		int target = 10;
		int firstIndex =-1; //2
		int lastIndex =-1;
		
		for(int i=0;i<a.length;i++) {
			
			//find the first index
			if(a[i] == target && firstIndex==-1) {
				firstIndex = i; //0
			}
			
			//find the last index
			
			int ind = a.length-1-i; // if i is 0, this will get 4, i -> 1 -> 3....
			if(a[ind]==target && lastIndex==-1) {
				lastIndex = ind;
			}
		}

		System.out.println(firstIndex);
		System.out.println(lastIndex);

		
		
	}

}
