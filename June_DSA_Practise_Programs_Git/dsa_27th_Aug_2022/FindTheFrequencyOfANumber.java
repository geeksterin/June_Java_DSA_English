package dsa_27th_Aug_2022;

public class FindTheFrequencyOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 2, 2, 2, 5, 5, 7, 9 };
		int target = 5;

		int first = findFirstOccurence(a, target);
		
		System.out.println(first);
		int last = findLastOccurence(a, target);
		
		System.out.println(last);
		
		
		int res = 0;
		if(first == -1 || last ==-1) {
			res = 0;
		}
		else{
			res = last - first +1;
		}
		
		System.out.println(res);


	}

	static int findFirstOccurence(int a[], int target) {

		int start = 0;
		int end = a.length -1;
		
		while(start<=end) {
			int mid = (start + end) /2;
			
			if(a[mid] == target && (mid ==0 || a[mid-1] < target)) {
				return mid;
			}
			
			else if(target <= a[mid]) {
				// left
				end = mid -1;
			}
			
			else if(target > a[mid]) {
				start = mid +1;
			}
		}
		
		return -1;
	}

	static int findLastOccurence(int a[], int target) {

		int start = 0;
		int end = a.length -1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(target == a[mid] && (mid == a.length-1 || a[mid+1]> target)) {
				return mid;
			}
			
			else if(target >= a[mid]) {
				//right
				
				start = mid + 1;
			}
			
			else if(target < a[mid]) {
				//left
				end = mid -1;
			}
			
			
		}
		
		return -1;
	}

}
