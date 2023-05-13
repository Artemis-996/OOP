package singlelevel;

public class department extends college{
	String name;
	String hod;
	int noOfStudents;
	int noOfLec;
	
	public department() {
		// TODO Auto-generated constructor stub
	}

	public department(String unName, String uniCode, String loc, String vc,String colName, String colLoc, String principal, 
			int colCode, String naac, String type,String name, String hod, int noOfStudents, int noOfLec) {
		super(unName, uniCode, loc, vc, colName, colLoc, principal, 
				colCode, naac, type);
		
		
		this.name = name;
		this.hod = hod;
		this.noOfStudents = noOfStudents;
		this.noOfLec = noOfLec;
	}
	
	public void displayDepartment()
	{
		displayCollege();
		
		System.out.println("Department Name : "+name);
		System.out.println("Head Of Department : "+hod );
		System.out.println("Total Students : "+noOfStudents);
		System.out.println("Total Lecturers : "+noOfLec);
		System.out.println("********************************");
	}
	
	

}
