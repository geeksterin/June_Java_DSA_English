package dsa_26th_Aug_2022;

public class FindFirstOccurenceInSortedArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 5, 5, 5, 5, 7 };
		int target = 5;

		int index = binarySearch(a, target);
		System.out.println(index);
	}

	static int binarySearch(int a[], int target) {

		int start = 0;
		int end = a.length - 1;

		while (start <= end) {

			int mid = (start + end) / 2;

			if (target == a[mid] && (mid == 0 || a[mid - 1] < target)) {
				return mid;
			}

			else if (target > a[mid]) {
				// traverse to the right
				start = mid + 1;

			}

			else if(target <= a[mid]){
				// traverse to the left
				end = mid - 1;
			}
		}

		return -1;
	}

}
