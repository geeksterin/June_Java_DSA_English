package dsa_12th_Sep_2022;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(30);
		al.add(90);
		
		//al.add(1,60);
		
		//al.remove(1);
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		
		//System.out.println(al);
	}

}
