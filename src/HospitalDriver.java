// Mike Vealey
// CSIT 211
// Spring 2017

public class HospitalDriver {

	public static void main(String[] args) {

		Administrator admin = new Administrator("Joe Smith", "Records", 12345.67, "410-555-1212", "Day");
		System.out.println("Admin:");
		System.out.println("\tName: " + admin.getName());
		System.out.println("\tDept: " + admin.getDepartment());
		System.out.println("\tSalary: " + admin.getSalary());
		System.out.println("\tPhone: " + admin.getPhoneNumber());
		System.out.println("\tShift: " + admin.getShift() + "\n");
		
		Doctor doc = new Doctor("Bill Jones", "Pediatrics", 123456.78, "Internist", "Clinic");
		System.out.println("Doctor:");
		System.out.println("\tName: " + doc.getName());
		System.out.println("\tDept: " + doc.getDepartment());
		System.out.println("\tSalary: " + doc.getSalary());
		System.out.println("\tSpeciality: " + doc.getSpeciality());
		System.out.println("\tLocation: " + doc.getLocation() + "\n");
		
		Nurse nurse = new Nurse("Jane Doe", "PostOp", 23456.78, 4, "Geriatrics");
		System.out.println("Nurse:");
		System.out.println("\tName: " + nurse.getName());
		System.out.println("\tDept: " + nurse.getDepartment());
		System.out.println("\tSalary: " + nurse.getSalary());
		System.out.println("\tFloor " + nurse.getFloor());
		System.out.println("\tWard: " + nurse.getWard() + "\n");

		Receptionist reception = new Receptionist("Sally Wilson", "Administration", 11222.33, "Front Desk");
		System.out.println("Receptionist:");
		System.out.println("\tName: " + reception.getName());
		System.out.println("\tDept: " + reception.getDepartment());
		System.out.println("\tSalary: " + reception.getSalary());
		System.out.println("\tLocation: " + reception.getLocation() + "\n");
		
		Surgeon surgeon = new Surgeon("Nancy Green", "General Surgury", 234567/89, "Joint Repair", "2B");
		System.out.println("Surgeon:");
		System.out.println("\tName: " + surgeon.getName());
		System.out.println("\tDept: " + surgeon.getDepartment());
		System.out.println("\tSalary: " + surgeon.getSalary());
		System.out.println("\tSpeciality: " + surgeon.getSpeciality());
		System.out.println("\tOR: " + surgeon.getOR() + "\n");
		
	}

}
