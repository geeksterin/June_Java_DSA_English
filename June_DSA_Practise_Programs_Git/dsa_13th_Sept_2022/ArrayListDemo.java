package dsa_13th_Sept_2022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			li.add(sc.nextInt());
			
		}

		//System.out.println(li.get(0));
		//regular
		/*
		 * for(int k=0;k<li.size();k++) { System.out.println(li.get(k)); }
		 */
		
		//for each
		for(Integer v : li) {
			System.out.println(v);
		}
		
		li.add(0,60);
		//System.out.println(li);
		//System.out.println(li.size());
		
		
	}

}
