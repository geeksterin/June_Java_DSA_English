package dsa_26th_Sept_2022;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindUniqueFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];

		Map<Integer, Integer> mp1 = new HashMap<>();

		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (mp1.containsKey(a[i])) {
				mp1.put(a[i], mp1.get(a[i]) + 1);
			} else {
				mp1.put(a[i], 1);
			}

		}
		sc.close();
		
		int arr[] = new int[mp1.size()];
		int k =0;
		for(int x : mp1.keySet()) {
			
			int val = mp1.get(x);
			arr[k++] = val;
			
		}
		
		//System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		boolean flag = true;
		for(int i=0;i<arr.length-1;i++) {
			
			if(a[i]!=0) {
				if(a[i]==a[i+1])
				{
					flag = false;
					break;
				}

			}
		}
		
		System.out.println(flag);
		
		
		
		//System.out.println(mp1);
	}

}
