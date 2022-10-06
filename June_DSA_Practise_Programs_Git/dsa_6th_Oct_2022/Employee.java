package dsa_6th_Oct_2022;

public class Employee{

	String name;
	int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	public String toString() {
		String t = "Name : "+this.name+", ID : "+this.id;
		
		return t;
	}

	
	Employee(){
		
	}
	
}
