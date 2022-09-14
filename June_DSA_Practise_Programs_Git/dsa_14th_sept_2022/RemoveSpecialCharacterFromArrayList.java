package dsa_14th_sept_2022;

import java.util.ArrayList;
import java.util.List;

public class RemoveSpecialCharacterFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Character> li = new ArrayList<>();
		li.add('g');
		li.add('y');
		li.add('r');
		li.add('*');
		li.add('u');
		li.add('o');
		li.add('*');
		li.add('*');
		System.out.println(li);

		
		Character ch = '*';
		
		int count = 0;
		
		for(Character r : li) {
			if(r.equals(ch)) {
				count++;
			}
		}
		for(int i=0;i<count;i++) {
			li.remove(ch);
		}
		
		System.out.println(li);
	}

}
