package dsa_13th_Sept_2022;

import java.util.ArrayList;
import java.util.List;

public class ALDemo2 {

	public static void main(String[] a) {
		List<Integer> li = new ArrayList<>();
		
		li.add(10);
		System.out.println(li);


		if(li.size()>0) {
			li.remove(li.size()-1);
			System.out.println(li);

		}
		
		else {
			System.out.println("no elements in the list");
		}
	}
}
