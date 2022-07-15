package dsa_15th_July_2022;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class CopyArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,2,4,5};
		
		int b[] = a;
		
		int c[] = Arrays.copyOfRange(a, 1, 4);
		
		System.out.println(Arrays.toString(c));
	}

}
