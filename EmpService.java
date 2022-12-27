package Company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Journey.Person;
import Journey.PersonDao;

public class EmpService {

	public static void main(String[] args) {
		
		List<Emp> e= new EmpDao().getEmployeesList();
		Map<Integer, Emp> map = new HashMap<>();
		for(Emp e1: e) {
			if(map.containsKey(e1.getSalary())) {
				Emp em = map.get(e1.getSalary());
				map.put(e1.getSalary(), new Emp(e1.getId(),e1.getName(),e1.getSalary()+ em.getSalary()));
			}
				else {
					map.put(e1.getSalary(), new Emp(e1.getId(),e1.getName(),e1.getSalary()));
				}	
			
		}
  System.out.println(map);
	}

}
