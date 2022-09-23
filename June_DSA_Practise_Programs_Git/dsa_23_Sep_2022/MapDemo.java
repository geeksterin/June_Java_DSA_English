package dsa_23_Sep_2022;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> map = new HashMap<>();
		map.put("India", "New Delhi");
		map.put("Russia", "Moscow");
		map.put("Nepal", "Katmandu");
		map.put("England", "London");
		
		System.out.println(map);
		System.out.println(map.get("India"));
		System.out.println(map.get("Australia"));
		
		
		for(String s : map.keySet()) {
			
			String value = map.get(s);
			System.out.println(s+ "--->"+value);
		}
		
		//India ---> NewDelhi

		System.out.println(map.containsKey("India"));
		
		map.remove("England");
		
		System.out.println(map);
		
		//map.put("China",null);
		
		map.put(null, "dbsvhbhsd");
		
		System.out.println(map.get(null));
		
		System.out.println(map);

		
	}

}
