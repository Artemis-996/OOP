package singlelevel;

public class zomatoDriver {
	public static void main(String[] args) {
		
		zomato z1 = new zomato("Zomato", "Deepender Goyal", "Gurugram", 1000000000.00, "Deepender Goyal", 63.00, 6522, 600.00);
		z1.displayZomato();
		
		Swiggy s1 = new Swiggy("Swiggy", "SriHarha", "Bangalore", 8500000000.00, "Sriharsha", 5202, 569);
		s1.displaySwiggy();
	}

}
