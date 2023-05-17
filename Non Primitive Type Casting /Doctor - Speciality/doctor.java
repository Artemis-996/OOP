public class doctor {
	String licence;
	String firstAid;
	
	doctor(){
	}
	
	doctor(String licence,String firstAid)
	{
		this.licence = licence;
		this.firstAid = firstAid;
	}
	
	public void displayDoctor()
	{
		System.out.println("Licence No : "+licence);
		System.out.println("First Aid : "+firstAid);
		System.out.println("*************************");
	}
	
	
}
