package dsa_25th_Aug_2022;

public class BinarySearchInDescendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,7,9,10,14,17,45};
		int target = 8;
		
		int index = binarySearch(a,target);
		System.out.println(index);
		
	}
	
	
	static int binarySearch(int a[], int target){
		
		int start = 0;
		int end = a.length -1;
		
		while(start<=end) {
			
			int mid = (start + end)/2;
			
			System.out.println("Start : "+start);
			System.out.println("end : "+end);
			System.out.println("mid "+mid);
			
			if(target == a[mid]) {
				return mid;
			}
			
			else if(target > a[mid]) {
				//traverse to the right
				start = mid + 1;
				
			}
			
			else {
				//traverse to the left
				end = mid -1;
			}
		}
		
		return -1;
	}

}
