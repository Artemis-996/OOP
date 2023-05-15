package singlelevel;

public class zomato extends foodApp {
	String ceo;
	double share;
	int cap;
	double subs;
	
	public zomato() {
		// TODO Auto-generated constructor stub
	}
	
	zomato(String name, String founder, String origin, double net, String ceo, double share,
			int cap, double subs)
	{
		super(name, founder, origin, net);
		this.ceo = ceo;
		this.share = share;
		this.cap = cap;
		this.subs = subs;
	}
	
	public void displayZomato() {
		displayFoodApp();
		
		System.out.println("CEO : "+ceo);
		System.out.println("Share Price : "+share);
		System.out.println("Number of captains : "+cap);
		System.out.println("Subscription Charges : "+subs);
		System.out.println("**********************************");
	}
	

}
