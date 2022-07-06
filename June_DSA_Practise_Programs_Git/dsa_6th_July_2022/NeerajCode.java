package dsa_6th_July_2022;

public class NeerajCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 45};
		int n = arr.length;
		int x = 10;

		int start = -1;
		int end = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] == x) {
				if (start < 0)
					start = i;

				end = i;
			}
		}
		if (start >= 0) {
			System.out.println(start);
			System.out.println(end);
		} else
			System.out.println(-1);

	}
}
