package dsa_13th_Sept_2022;

import java.util.ArrayList;
import java.util.List;

public class ALDemoForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li = new ArrayList<>();
		li.add("Bangalore");
		li.add("Hyderabad");
		li.add("Pune");
		li.add("Patna");
		li.add("Lucknow");
		li.add("Dehradun");
		li.add("Nagpur");
		li.add("Bhopal");		
		
		for(String s : li) {
			if(s.startsWith("B")) {
				System.out.println(s + " city");
			}
			
		}
		
		for(String s : li) {
			if(s.length()>5) {
				System.out.println(s);
			}
			
		}
		
		/*for(String s : li) {
			if(s.equalsIgnoreCase("Nagpur")) {
				System.out.println("present");
			}
			
		}*/
		
		
		if(li.contains("Nagpur")) {
			System.out.println("present");

		}
		
		else {
			System.out.println("not present");

		}
		
		
		li.remove("Lucknow");
		
		for(String s: li) {
			System.out.println(s);
		}
		
	}

}
