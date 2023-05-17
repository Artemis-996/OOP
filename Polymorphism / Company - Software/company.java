package polymorphism;

public class company {
	String name;
	String type;
	String location;
	
	company(){
	}
	
	company(	String name, String type, String location){
		this.name = name;
		this.type = type;
		this.location = location;
	}

	public void displaytype()
	{
		System.out.println("Location : "+location);
	}
	
	public void displayCompany()
	{
		System.out.println("Name : "+name);
		System.out.println("Type : "+type);
		System.out.println("Location : "+location);
		System.out.println("***********************");
	}
}
