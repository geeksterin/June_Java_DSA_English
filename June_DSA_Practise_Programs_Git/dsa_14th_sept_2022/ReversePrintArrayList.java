package dsa_14th_sept_2022;

import java.util.ArrayList;
import java.util.List;

public class ReversePrintArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = new ArrayList<>();
		List<Integer> li2 = new ArrayList<>();

		li.add(10);
		li.add(20);
		li.add(30);
		
		System.out.println(li);
		
		for(int i=li.size()-1;i>=0;i--) {
			System.out.println(li.get(i));
		}
		
		int temp = li.size()-1;
		
		for(Integer x : li) {
			li2.add(0);
		}
		
		int idx = 0;

		for(Integer x : li) {
			li2.remove(idx);
			li2.add(temp,x);
			temp--;
			idx++;
		}
		
		
		for(Integer m : li2) {
			System.out.println(m);
		}
	}

}
