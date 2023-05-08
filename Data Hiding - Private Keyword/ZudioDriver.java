
public class ZudioDriver {
	
	public static void main(String[] args) {
		Zudio z1 = new Zudio("Hoddie", "ZD121", "Black", 800.00, "Diwali", "M");
		
		System.out.println(z1.getName("ZD121"));
		System.out.println(z1.getColor("ZD121"));
		System.out.println(z1.getPrice("ZD121"));
		System.out.println(z1.getSize("ZD121"));
		z1.setCoupon("Diwali");
	}

}
