//An example on lazy binding create an object when called via helping method
package relationship;

public class PenDrive {
	
	String brand;
	int size;
	double cost;

	public PenDrive() {
	}
	
	public PenDrive(String brand, int size, double cost) {
		this.brand = brand;
		this.size = size;
		this.cost = cost;
	}
	
	public void displayPendrive()
	{
		System.out.println("**** PenDrive Details ****");
		System.out.println("Brand : "+brand);
		System.out.println("Size : "+size);
		System.out.println("Cost :"+cost);
		System.out.println("*********************");
	}
	
	

}
