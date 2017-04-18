// Mike Vealey
// CSIT 211
// Spring 2017

public class Receptionist extends Employee {
	private String location;
	
	public Receptionist(String iName, String iDepartment, double iSalary, 
			String iLocation) {
		
		super(iName, iDepartment, iSalary);
		location = iLocation;
	}
	
	public String getLocation() {
		return location;
	}
}
