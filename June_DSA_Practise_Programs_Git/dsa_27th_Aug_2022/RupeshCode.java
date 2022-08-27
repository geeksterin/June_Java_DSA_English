package dsa_27th_Aug_2022;

public class RupeshCode {

	public static int square_root(int n) {
		int start = 1;
		int end = n / 2;
		while (start <= end) {
			int mid = (start + end) / 2;

			if (mid * mid == n) {
				return mid;
			} else if (n > mid * mid) { // 100 > 5 * 5
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 100;
		System.out.println(square_root(n));
	}

}
