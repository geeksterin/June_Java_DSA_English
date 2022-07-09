package dsa_9th_July_2022;

public class FindMinimumIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,2,4,1};
		
		int minInd = 0;
		
		for(int i =1;i<a.length;i++) {
			if(a[i]<a[minInd]) { //2 <a[0]  2 < 10
				minInd = i; //1
			}
		}
		
		System.out.println(minInd);
	}

}
