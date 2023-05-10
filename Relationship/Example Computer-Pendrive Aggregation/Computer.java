//An example on lazy binding create an object when called via helping method
package relationship;

public class Computer {
	
	String brand;
	String processor;
	String os;
	String RAM;
	String ROM;
	PenDrive p1;

	public Computer() {
	}

	public Computer(String brand, String processor, String os, String rAM, String rOM) {
		this.brand = brand;
		this.processor = processor;
		this.os = os;
		RAM = rAM;
		ROM = rOM;
	}
	
	public void displayComputer()
	{
		System.out.println("**** About Computer ****");
		System.out.println("Brand : "+brand);
		System.out.println("Processor : "+processor);
		System.out.println("Operating System :"+os);
		System.out.println("RAM : "+RAM);
		System.out.println("ROM : "+ROM);
	}
	
	public void insertPendrive(String brand, int size, double cost)
	{
		p1 = new PenDrive(brand,size, cost);
		System.out.println("Pendrive Inserted");
	}
	
	
	

}
