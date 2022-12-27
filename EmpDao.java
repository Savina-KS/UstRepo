package Company;

import java.util.ArrayList;
import java.util.List;



public class EmpDao {
	
	public List<Emp> getEmployeesList (){
		List<Emp> p = new ArrayList<>();
		p.add(new Emp(10, "Arun", 10000));
		p.add(new Emp(18, "Anu", 10000));
		p.add(new Emp(103, "Hari", 90000));
		
		return p;
		
	}

}
