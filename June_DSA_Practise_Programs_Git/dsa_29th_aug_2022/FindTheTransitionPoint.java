package dsa_29th_aug_2022;

public class FindTheTransitionPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,1,1};
		
		int target = 0;
		
		int idx = findlastOccurence(a,target);
		System.out.println(idx);
		
	}

	private static int findlastOccurence(int[] a, int target) {
		
		int start = 0;
		int end = a.length -1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(target == a[mid] && mid ==a.length -1) {
				return -1;
			}
			
			else if(target == a[mid] && a[mid+1]>target) {
				return mid+1;
			}
			
			else if(target >= a[mid]) {
				start = mid + 1;
			}
			
			else if(target <a[mid]) {
				end= mid -1;
			}
		}
		
		return -1;
	}

}
