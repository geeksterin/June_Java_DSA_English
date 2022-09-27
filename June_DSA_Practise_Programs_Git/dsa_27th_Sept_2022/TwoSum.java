package dsa_27th_Sept_2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[] = {2,7,11,15};
		int target = 9;
		
		Map<Integer,Integer> map = new HashMap<>();
		
		int res[] = new int[2];
		
		for(int i=0;i<a.length;i++) {
			int x = target - a[i];
			
			if(map.containsKey(x)) {
				res[0] = map.get(x);
				res[1] = i;
				break;
			}
			
			else {
				map.put(a[i], i);
			}
		}
		
		System.out.println(Arrays.toString(res));
		
	}

}
