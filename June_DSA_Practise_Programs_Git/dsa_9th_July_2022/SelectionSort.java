package dsa_9th_July_2022;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 12, 17, 10, 13, 16 }; 
		
		for(int i =0;i<a.length-1;i++) {
			
			int minIndex = i;
			
			for(int j = i+1;j<a.length;j++) {
				if(a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			
			//Swap minIndex and i
			int temp = a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp;
		}
		
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
