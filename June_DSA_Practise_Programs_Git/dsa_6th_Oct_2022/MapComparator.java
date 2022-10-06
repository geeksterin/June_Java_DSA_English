package dsa_6th_Oct_2022;

import java.util.Comparator;
import java.util.Map.Entry;

public class MapComparator implements Comparator<Entry<Integer,Integer>>{

	@Override
	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
		
		return o1.getValue() - o2.getValue();
	}

}
