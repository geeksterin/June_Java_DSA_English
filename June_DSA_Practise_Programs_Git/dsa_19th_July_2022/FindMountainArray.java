package dsa_19th_July_2022;

public class FindMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,3,2,1};
		
		int j =0;
		
		boolean isMountain = true;
		
		//There are 2 parts in the mountain
		//first part -> increasing order (start to peak element(top))
		//second part -> decreasing order (peak to end)
		
		
		//find the first part where all elements are in increasing oder
		
		while(j<a.length-1 && a[j]<a[j+1]) {
			j++;
		}
		
		//In the above loop, we would reach to the peak point(top of array)
		
		
		//Check for boundary conditions
		//if j==0 -> all elements are in descreasing order// hence not a mountain
		//if j==a.lenght-1 -> all elemets are in increasing order// hence not a mountain
		if(j==0 || j==a.length-1) { 
			
			isMountain = false;

		}
		
		
		//find the second part from peak to end of the array
		//it should be in descending order
		
		while(j<a.length-1 && a[j]>a[j+1]) {
			j++;
		}
		
		
		
		//if j has reached the end of the array, its a mountain
		//else its not
		
		if(j!=a.length-1) {
			isMountain = false;
		}
		
		System.out.println(isMountain);
	}

}
