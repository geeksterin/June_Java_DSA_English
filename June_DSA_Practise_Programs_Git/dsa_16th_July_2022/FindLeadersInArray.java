package dsa_16th_July_2022;

public class FindLeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {16,17,4,3,5,2};
		

		for(int i=0;i<a.length;i++) {
			
			int leader = a[i];
			boolean isLeader = true;

			for(int j=i+1;j<a.length;j++) {//6
				if(a[j]<leader) {
					continue;
				}
				
				else {
					isLeader = false;
					break;
				}
			}
			

			if(isLeader==true) {
				System.out.println(leader);
			}
		}
		
	}

}
