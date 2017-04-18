// Mike Vealey
// CSIT 211
// Spring 2017

public class Administrator extends Employee {
	private String phoneNumber;
	private String shift;
	
	public Administrator(String iName, String iDepartment, double iSalary, 
			String iPhoneNumber, String iShift) {
		
		super(iName, iDepartment, iSalary);
		phoneNumber = iPhoneNumber;
		shift = iShift;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getShift() {
		return shift;
	}
}
