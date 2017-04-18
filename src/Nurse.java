// Mike Vealey
// CSIT 211
// Spring 2017

public class Nurse extends Employee {
	private int floor;
	private String ward;
	
	public Nurse(String iName, String iDepartment, double iSalary, 
			int iFloor, String iWard) {
		
		super(iName, iDepartment, iSalary);
		floor = iFloor;
		ward = iWard;;
	}
	
	public int getFloor() {
		return floor;
	}
	
	public String getWard() {
		return ward;
	}
	
}
