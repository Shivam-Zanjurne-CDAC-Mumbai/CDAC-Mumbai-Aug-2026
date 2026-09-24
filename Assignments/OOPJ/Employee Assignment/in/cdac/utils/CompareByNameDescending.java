package in.cdac.utils;

import java.util.Comparator;

import in.cdac.employee.Employee;

public class CompareByNameDescending implements Comparator<Employee>{
	@Override
	public int compare(Employee o1, Employee o2) {
		int compareResult = o1.getName().compareTo(o2.getName());
		if(compareResult == 0) {
			return 0;
		}
		else if(compareResult >= 1) {
			return -1;
		}
		
		return 1;
		
	}
}
