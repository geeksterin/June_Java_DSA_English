package dsa_16th_July_2022;

import java.util.Arrays;

public class TwoSumLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {2,7,11,15};
		int target = 9;
		int[] output = twoSum(nums,target);
		System.out.println(Arrays.toString(output));
	}

	public static int[] twoSum(int[] nums, int target) {

		int output[] = new int[2];

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					output[0] = i;
					output[1] = j;
				}
			}
		}

		return output;

	}
}
