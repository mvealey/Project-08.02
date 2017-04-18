// Mike Vealey
// CSIT 211
// Spring 2017

public class Surgeon extends Employee {
	private String speciality;
	private String or;
	
	public Surgeon(String iName, String iDepartment, double iSalary, 
			String iSpeciality, String iOR) {
		
		super(iName, iDepartment, iSalary);
		speciality = iSpeciality;
		or = iOR;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	
	public String getOR() {
		return or;
	}
	
}
