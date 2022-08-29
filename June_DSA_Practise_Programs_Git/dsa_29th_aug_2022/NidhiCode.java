package dsa_29th_aug_2022;

public class NidhiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 8 };
		int b[] = { 1, 3, 4, 5, 9 };
		
		for (int i = 0; i < a.length; i++) {
			int k = findCommonElementInBoth(a[i], b);
			if (k != -1) {
				System.out.print(k + " ");
			}

		}
	}

	public static int findCommonElementInBoth(int target, int b[]) {
		int start = 0;
		int end = b.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (b[mid] == target) {
				return target;
			} else if (b[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;

	}

}
