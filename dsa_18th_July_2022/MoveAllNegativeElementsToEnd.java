package dsa_18th_July_2022;

public class MoveAllNegativeElementsToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {-3,1,2,1,-7,8};
		int b[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>= 0)
            {
                b[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                b[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(b[i]+" ");
        }

	}

}
