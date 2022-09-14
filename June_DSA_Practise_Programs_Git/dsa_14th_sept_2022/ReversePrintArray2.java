package dsa_14th_sept_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversePrintArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		
		int temp[] = new int[li.size()];

		int j = temp.length-1;
		for(Integer i : li) {
			temp[j] = i;
			j--;
		}
	
		for(int m : temp) {
			System.out.println(m);
		}
	}

}
