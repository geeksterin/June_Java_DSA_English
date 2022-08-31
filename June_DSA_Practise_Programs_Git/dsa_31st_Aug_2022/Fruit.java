package dsa_31st_Aug_2022;

public class Fruit {

	String colour ="RED";
	 int size;
	
	
	Fruit(){
		
	}
	 
	 Fruit(String s1, int s2){
		 colour = s1;
		 size = s2;
	 }
	 
	 
	 void m1(){
		 System.out.println("in m1()");
		 m2();
	 }
	 
	 void m2(){
		 System.out.println("in m2()");

	 }
}

 