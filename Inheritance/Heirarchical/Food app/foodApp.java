package singlelevel;

public class foodApp {

	String name;
	String founder;
	String origin;
	double net;
	
	public foodApp() {
		// TODO Auto-generated constructor stub
	}

	
	public foodApp(String name, String founder, String origin, double net) {
		super();
		this.name = name;
		this.founder = founder;
		this.origin = origin;
		this.net = net;
	}
	
	public void displayFoodApp()
	{
		System.out.println("Name : "+name);
		System.out.println("Founder : "+founder);
		System.out.println("Origin : "+origin);
		System.out.println("Net Worth"+net);
		System.out.println("***********************");
	}
	
	
}
