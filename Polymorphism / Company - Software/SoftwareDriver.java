package polymorphism;

public class SoftwareDriver {

	public static void main(String[] args) {
		software s1 = new software("Infosys", "Software", "Mysore", "Infosys Ltd.", 200000, "Softwares");
		
		company c1 = s1;
		c1.displayCompany();
		c1.displaytype();
		
		
		
	}

}
