package dsa_27th_Aug_2022;

public class FindTheInsertPositionOfANumberInSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {2,2,2,5,5,8};
		int target = 5;
		
		int index = binarySearch(a, target);
		System.out.println(index);
	}
	
	static int binarySearch(int a[], int target) {
		int start = 0;
		int end = a.length -1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			
			System.out.println("start : "+start);
			System.out.println("end : "+end);
			System.out.println("mid : "+mid);
			System.out.println("------------------");
			
			
			
			if(a[mid] == target) {
				return mid;
			}
			
			else if(target > a[mid]) {
				//right
				start = mid +1;
			}
			
			else {
				end = mid -1;
			}
			
			
			System.out.println("After operation start : "+start);
			System.out.println("After operation  end : "+end);
			System.out.println("After operation  mid : "+mid);
			System.out.println("------------------");


		}
		return start;// end+1
	}

}
