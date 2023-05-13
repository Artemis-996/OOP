package singlelevel;

public class university {
	
	String uniName;
	String uniCode;
	String loc;
	String vc;
	
	public university() {
		// TODO Auto-generated constructor stub
	}

	
	public university(String uniName, String uniCode, String loc, String vc) {
		super();
		this.uniName = uniName;
		this.uniCode = uniCode;
		this.loc = loc;
		this.vc = vc;
	}
	
	public void displayUniversity()
	{
		System.out.println("University Name :"+uniName);
		System.out.println("University Code : "+uniCode);
		System.out.println("University Location : "+loc);
		System.out.println("Vice Chancellor : "+vc);
		System.out.println("*****************************");
	}
	

}
