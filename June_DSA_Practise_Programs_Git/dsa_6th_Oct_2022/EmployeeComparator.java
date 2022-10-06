package dsa_6th_Oct_2022;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.id - e2.id;
	}

}
