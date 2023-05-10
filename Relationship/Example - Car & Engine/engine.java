//an example on early binding as we are creating an object before the main object is created.	
package relationship;

public class engine {
	
	String fuel;
	int cc;
	double bhp;
	int wt;
	int cy;
	int stroke;
	
	public engine() {
		// TODO Auto-generated constructor stub
	}
	
	
	public engine(String fuel, int cc, double bhp, int wt, int cy, int stroke) {
		this.fuel = fuel;
		this.cc = cc;
		this.bhp = bhp;
		this.wt = wt;
		this.cy = cy;
		this.stroke = stroke;
		
		
	}
	
	public void displayEngine()
	{
		System.out.println("***** Engine Details *****");
		System.out.println("Fuel Type : "+fuel);
		System.out.println("CC : "+cc);
		System.out.println("bhp : "+bhp);
		System.out.println("wt : "+wt);
		System.out.println("cy : "+cy);
		System.out.println("Strokes : "+stroke);
		System.out.println("**********************");
	}

	

	
	
	

}
