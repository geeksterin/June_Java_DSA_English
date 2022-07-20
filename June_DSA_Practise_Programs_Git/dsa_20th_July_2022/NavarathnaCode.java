package dsa_20th_July_2022;

public class NavarathnaCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		      int a[]={1,2,3,4,5,6};
		      int large = a[0];
		      int small = a[0];
		      
		      for(int i=1;i<a.length;i++){
		        if(a[i]<small){
		          small=a[i];
		        }
		        if(a[i]>large){
		          large=a[i];
		        }
		      }
		      System.out.println(small);
		      System.out.println(large);
		  }
		

	

}
