package dsa_15th_Oct_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortWithIncreasingFrequency {

	public static void main(String[] args) {

		//int a[] = { 2, 5, 2, 8, 1, 5, 6, 8, 8 };
		
		char a[] = {'a','b','a','d','b','c'};

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				int freq = map.get(a[i]);
				map.put(a[i], freq + 1);
			} else {
				map.put(a[i], 1);
			}
		}

		List<Entry<Character, Integer>> li = new ArrayList<>();
		li.addAll(map.entrySet());

		Comparator myc = new MyComparator();
		Collections.sort(li, myc);
		System.out.println(li);

		for (Entry<Character, Integer> e : map.entrySet()) {
			System.out.println(e.getKey());
		}

	}

}

class MyComparator implements Comparator<Entry<Integer, Integer>> {

	@Override
	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
		return o1.getValue() - o2.getValue();
	}

}
