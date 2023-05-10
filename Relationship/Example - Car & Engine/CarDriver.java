//an example on early binding as we are creating an object before the main object is created.	
package relationship;

public class CarDriver {

	public static void main(String[] args) {
		
		car c1 = new car("Rolls Royce", "Boat Tail", 2000000000.00, "Bronze");
		
		c1.displayCar();
		c1.e1.displayEngine();
		
	}

}
