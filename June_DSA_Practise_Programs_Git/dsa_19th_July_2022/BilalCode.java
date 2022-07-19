package dsa_19th_July_2022;

public class BilalCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,2,1};
		
		//int l = a.length-1; // 4
		int i = 0;
		boolean flag = true;
	    int j = a.length -1;
		while(i<j)
		{
			if(a[i]!=a[j])
			{
			flag=false;
			break;
			}
			
			i++;
			j--;
		}
		System.out.println(flag);
	}

}
