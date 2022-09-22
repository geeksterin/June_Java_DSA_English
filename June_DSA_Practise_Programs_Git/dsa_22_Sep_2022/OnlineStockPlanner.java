package dsa_22_Sep_2022;

public class OnlineStockPlanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {100,80,60,70,60,75,85};
		
		System.out.println(1+" ");
		for(int i=1;i<a.length;i++) {
			int count = 1;
			//boolean consecut
			for(int j=i-1; j>=0;j--) {
				if(a[j]<=a[i]){
					count++;
				}
				else {
					break;
				}
			}
			
			System.out.println(count);
		}
	}

}
