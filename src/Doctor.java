// Mike Vealey
// CSIT 211
// Spring 2017

public class Doctor extends Employee {
	private String speciality;
	private String location;
	
	public Doctor(String iName, String iDepartment, double iSalary, 
			String iSpeciality, String iLocation) {
		
		super(iName, iDepartment, iSalary);
		speciality = iSpeciality;
		location = iLocation;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	
	public String getLocation() {
		return location;
	}
}
