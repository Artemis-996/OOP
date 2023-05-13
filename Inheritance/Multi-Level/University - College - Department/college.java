package singlelevel;

import java.security.Principal;

public class college extends university{
	
	String colName;
	String colLoc;
	String principal;
	int colCode;
	String naac;
	String type;
	
	public college() {
		// TODO Auto-generated constructor stub
	}

	
	public college(String uniName, String uniCode, String loc, String vc,String colName, String colLoc, String principal, 
					int colCode, String naac, String type) {
		super();
		this.uniName = uniName;
		this.uniCode = uniCode;
		this.loc = loc;
		this.vc = vc;
		
		this.colName = colName;
		this.colLoc = colLoc;
		this.principal = principal;
		this.colCode = colCode;
		this.naac = naac;
		this.type = type;
	}
	
	public void displayCollege()
	{
		displayUniversity();
		
		System.out.println("College Name : "+colName);
		System.out.println("College Location : "+colLoc);
		System.out.println("Principal : "+principal);
		System.out.println("College Code : "+colCode);
		System.out.println("Naac Grade : "+naac);
		System.out.println("Type : "+type);
		System.out.println("***************************");
	}
	
	
	
	

}
