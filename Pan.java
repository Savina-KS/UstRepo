package Validation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Employee.EmployeeDao;
import Employee.Model;

public class Pan {

	public static void main(String[] args) {
		
		
		List<String> e= new EmpDao().getEmployeesList().stream().map(f->f.getPan()).collect(Collectors.toList());
		List<String> valid =e.stream().filter(t -> t.matches("[A-Z]{5}\\d{4}[A-Z]")).toList();
		List<String> inValid =e.stream().filter(y-> !(y.matches("[A-Z]{5}\\d{4}[A-Z]"))).toList();
		
		System.out.println("Valid PAN numbers: "+valid);
		System.out.println("Invalid PAN numbers: "+inValid);
	}

}
