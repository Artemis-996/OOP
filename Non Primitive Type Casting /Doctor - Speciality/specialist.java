
public class specialist extends doctor {
	String name;
	String speciality;
	double yoe;
	
	specialist(){
	}
	
	specialist(String licence,String firstAid,String name, String speciality, double yoe){
		super(licence,firstAid);
		this.name = name;
		this.speciality = speciality;
		this.yoe = yoe;
	}
	
	public void displaySpecialist() {
		displayDoctor();
		
		System.out.println("Name : "+name);
		System.out.println("Specialist : "+speciality);
		System.out.println("Year of passing : "+yoe);
		System.out.println("*************************");
	}
	
}
