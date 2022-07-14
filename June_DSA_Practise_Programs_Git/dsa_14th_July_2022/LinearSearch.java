package dsa_14th_July_2022;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {10,3,4,3,1,2,5,6,19}; //max -> 19
		
		int target = 13;
		
		
		
		for(int k=1;k<=19;k++) {
			boolean flag = false;

			for(int i=0;i<a.length;i++) {
				if(a[i]==k) {
					flag = true;
					break;
				
				}
			}
			
			if(flag==false) {
				System.out.println(k);
				break;
			}
			
		}
		
		
	}

}
