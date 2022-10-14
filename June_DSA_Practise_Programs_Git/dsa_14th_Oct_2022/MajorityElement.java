package dsa_14th_Oct_2022;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String args[]) {
		int nums[] = { 2, 2, 1, 1, 1, 2, 2 };
		int r = majorityElement(nums);
		System.out.println(r);

	}

	public static int majorityElement(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int c = map.get(nums[i]);
				map.put(nums[i], c + 1);
			}

			else {
				map.put(nums[i], 1);

			}
		}

		for (int x : map.keySet()) {
			if (map.get(x) > nums.length / 2) {
				return x;
			}
		}

		return -1;
	}
}
