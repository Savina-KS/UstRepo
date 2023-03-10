package Ust;

public class Empl {
	
	private int id;
	private String name;
	private String location;
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Empl(int id, String name, String location, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Empl [id=" + id + ", name=" + name + ", location=" + location + ", salary=" + salary + "]";
	}

}
