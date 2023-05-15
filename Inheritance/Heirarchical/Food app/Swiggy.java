package singlelevel;

public class Swiggy extends foodApp{
	
	String ceo;
	int cap;
	double subs;
	
	public Swiggy() {
		// TODO Auto-generated constructor stub
	}
	
	Swiggy(String name, String founder, String origin, double net, String ceo, int cap, double subs)
	{
		super(name, founder, origin, net);
		this.ceo = ceo;
		this.cap=cap;
		this.subs=subs;
	}
	
	public void displaySwiggy()
	{
		displayFoodApp();
		
		System.out.println("CEO : "+ceo);
		System.out.println("Number of captains :"+cap);
		System.out.println("Subscription Charges : "+subs);
		System.out.println("**********************************");
	}
 
}
