package dsa_2nd_Sept_2022;

public class Television extends Appliance{

	float price;
	String type;
	
	Television(){
		System.out.println("In television constructor");
	}
	
	void switchOn(String s){
		System.out.println("In Television switchOn()");
	}
	
}
