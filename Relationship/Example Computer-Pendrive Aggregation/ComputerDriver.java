//An example on lazy binding create an object when called via helping method
package relationship;

public class ComputerDriver {

	public static void main(String[] args) {
		
		Computer c1 = new Computer("Asus", "I7 9th Gen", "Windows 10", "8 GB", "1 TB");
		c1.displayComputer();
		
		//c1.p1.displayPendrive(); null pointer
		
		
		c1.insertPendrive("HP", 32, 500);
		
		c1.p1.displayPendrive();

	}

}
