package dsa_6th_Oct_2022;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Integer> li = new ArrayList<>();
		/*
		 * List<Integer> li = new ArrayList<>();
		 * 
		 * li.add(10); li.add(4); li.add(5); li.add(3); li.add(13);
		 * 
		 * System.out.println("before : "+li);
		 * 
		 * Collections.sort(li);
		 * 
		 * System.out.println("after : "+li);
		 */

		Employee e1 = new Employee("Bheem", 1040);
		Employee e2 = new Employee("Sam", 3090);
		Employee e3 = new Employee("Harsh", 3011);
		Employee e4 = new Employee("Veer", 6721);
		
		List<Employee> list = new ArrayList<>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		//System.out.println(e3);
		System.out.println(list);
		
		EmployeeComparator ec = new EmployeeComparator();
		Collections.sort(list,ec);
		
		System.out.println(list);
		
		
		Map<Integer,Integer> map1 = new HashMap<>();
		map1.put(0,10);
		map1.put(1,20);
		map1.put(2,7);
		
		List<Entry<Integer,Integer>> listEntries = new ArrayList<>();
		listEntries.addAll(map1.entrySet());
		
		MapComparator mapComp = new MapComparator();
		
		Collections.sort(listEntries, mapComp);
		
		System.out.println(listEntries);
	
		 
		
		
		
		
		

		
		
		
		


	}

}
