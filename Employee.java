package Validation;

public class Employee {
	
	private String name;
	private String pan;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public Employee(String name, String pan) {
		super();
		this.name = name;
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", pan=" + pan + "]";
	}
	
	

}
