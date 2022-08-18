package dsa_18th_Aug_2022;

public class AbhishekCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res = 0;
		
		int arr[]={0,1,0,0,0,1,1,0,0,1,1,1,1,1,1};
	    int m=0;
	    for(int i=0;i<arr.length-1;i++)
	    {
	        int c=0;
	        if(arr[i]==arr[i+1])
	        {
	            c++;
	        }
	        res=Math.max(m,c);
	        
	    }
		System.out.println(res);
	}

}
