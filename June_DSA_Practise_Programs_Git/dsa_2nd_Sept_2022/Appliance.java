package dsa_2nd_Sept_2022;

public class Appliance {

	String model;
	String warranty;
	
	Appliance(){
		System.out.println("In Appliance constructor");
	}
	
	void switchOn(String s){
		System.out.println("In Appliance switchOn()");
	}
}
