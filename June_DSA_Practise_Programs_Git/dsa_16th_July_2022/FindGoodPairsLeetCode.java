package dsa_16th_July_2022;

public class FindGoodPairsLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {1,2,3,1,1,3};
		int output = numIdenticalPairs(nums);
		System.out.println(output);
		
	}
	
	 public static int numIdenticalPairs(int[] nums) {
	        
	        
	        int c = 0;
	        for(int i=0;i<=nums.length-1;i++){
	            for(int j=i+1;j<nums.length;j++){
	                if(nums[i]==nums[j]){
	                    c++;
	                }
	            }
	        }
	        
	        return c;
	        
	        
	    }

}
