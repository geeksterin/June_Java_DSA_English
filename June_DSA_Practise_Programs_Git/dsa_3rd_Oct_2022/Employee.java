package dsa_3rd_Oct_2022;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{

	String name;
	float sal;
	
	public Employee(String name, float sal) {
		super();
		this.name = name;
		this.sal = sal;
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.sal == o2.sal) {
			return 0;
		}
		
		else if(o1.sal > o2.sal) {
			return +1;
		}
		
		else {
			return -1;
		}
	}
	
	public String toString() {
		String s = "Name : "+this.name+ ", salary : "+this.sal;
		return s;
		
	}
	
	
	
	
	
	
	
}
