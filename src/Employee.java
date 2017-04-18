// Mike Vealey
// CSIT 211
// Spring 2017

public class Employee {

	private String name;
	private String department;
	private double salary;
	
	public Employee(String iName, String iDepartment, double iSalary) {
		name = iName;
		department = iDepartment;
		salary = iSalary;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public double getSalary() {
		return salary;
	}
}
