package dsa_27th_July_2022;

public class CheckIfIdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

		boolean flag = true;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (i == j && a[i][j] != 1) { // primary diagonal
					flag = false;
					break;
				}

				else if (i != j && a[i][j] != 0) { // non -primary diagonal shoyuld be 0
					flag = false;
					break;

				}
			}
		}

		System.out.println(flag);

	}

}
