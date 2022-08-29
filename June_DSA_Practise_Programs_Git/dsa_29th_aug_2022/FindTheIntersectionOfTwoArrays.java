package dsa_29th_aug_2022;

public class FindTheIntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 3, 3, 3, 3, 4 };
		int b[] = { 1, 3, 4, 6, 9 };

		if (a[0] != a[1]) {
			int idx = binarySearch(b,a[0]);
			System.out.print(idx + " ");
		}
		
		for (int i = 1; i < a.length; i++) {
			
			if (a[i] != a[i - 1]) {
				int target = a[i];
				int idx = binarySearch(b, target);

				if (idx != -1) {
					System.out.print(idx + " ");
				}
			}

			
		}

	}

	static int binarySearch(int a[], int target) {
		int start = 0;
		int end = a.length - 1;

		while (start <= end) {
			int mid = (start + end) / 2;

			if (target == a[mid]) {
				return target;
			}

			else if (target > a[mid]) {
				start = mid + 1;
			}

			else {
				end = mid - 1;
			}
		}

		return -1;
	}

}
