package polymorphism;

public class software extends company{
	String name;
	int noOfEmp;
	String product;
	
	software(){
	}
	
	public software(String name, String type, String location,String name1, int noOfEmp, String product) {
		super(name,type,location);
		this.name = name1;
		this.noOfEmp = noOfEmp;
		this.product = product;
	}
	

	
	public void displayCompany()
	{
		System.out.println("Name : "+name);
		System.out.println("Location : "+location);
		System.out.println("Number of employees : "+noOfEmp );
		System.out.println("Product Type : "+product);
		System.out.println("***********************");
	}
	
}
