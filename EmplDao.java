package Ust;

import java.util.ArrayList;
import java.util.List;

public class EmplDao {
	
	public List<Empl> getEmployeesList (){
		List<Empl> p = new ArrayList<>();
		p.add(new Empl(101, "Arunima", "Kochi", 20000));
		p.add(new Empl(102, "Karun", "Bangalore", 50000));
		p.add(new Empl(103, "Naveen", "Kozhikod", 40000));
		p.add(new Empl(104, "Anu", "Tvm", 80000));
		p.add(new Empl(105, "Manu", "Chennai", 84000));
		return p;

}
}