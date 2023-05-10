//an example on early binding as we are creating an object before the main object is created.	
package relationship;

public class car {

	String brand ;
	String model;
	double price ;
	String color;
	engine e1;
	
	public car() {
		// TODO Auto-generated constructor stub
	}
	
	public car(String brand, String model, double price, String color) {
		
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.color = color;
		e1 = new engine("Petrol", 1200 , 91.00, 100, 4, 4);
		
	}
	
	public void displayCar()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Price : "+price);
		System.out.println("Color : "+color );
	}
	
	

}
