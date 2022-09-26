package dsa_26th_Sept_2022;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Integer> map1 = new HashMap<>();
		map1.put(1, 2);
		map1.put(2, 3);
		map1.put(6, 3);
		
		Map<Integer,Integer> map2 = new HashMap<>();
		
		boolean found = false;
		for(int key : map1.keySet()) {
			int val = map1.get(key);
			
			if(map2.containsKey(val)) {
				found = true;
			}
			
			else {
				map2.put(val, key); //4 -> 1 3-> 2
			}
		}
		
		System.out.println(found);
	}

}
