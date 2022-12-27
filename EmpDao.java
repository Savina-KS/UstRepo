package Validation;

import java.util.ArrayList;
import java.util.List;

public class EmpDao {

	public List<Employee> getEmployeesList (){
		List<Employee> emp = new ArrayList<>();
		emp.add(new Employee("Anu", "ASDFG1234R"));
		emp.add(new Employee("Arun","K89000"));
		emp.add(new Employee("Hari","Tjk9090989"));
		
		return emp;
		
	}

}
