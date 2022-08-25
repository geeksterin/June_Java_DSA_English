package dsa_25th_Aug_2022;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {45, 23, 15, 7, 3, 0};
		int target = 89;
		
		int index = binarySearch(a,target);
		System.out.println(index);
		
	}
	
	
	static int binarySearch(int a[], int target){
		
		int start = 0;
		int end = a.length -1;
		
		while(start<=end) {
			
			int mid = (start + end)/2;
			
			/*
			 * System.out.println("Start : "+start); System.out.println("end : "+end);
			 * System.out.println("mid "+mid);
			 */
			
			if(target == a[mid]) {
				return mid;
			}
			
			else if(target > a[mid]) {
				//traverse to the left
				end = mid -1;
				
			}
			
			else {
				//traverse to the right
				start = mid + 1;
			}
		}
		
		return -1;
	}

}
