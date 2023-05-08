
public class Zudio {
	
	private String name;
	private String id;
	private String color;
	private double price;
	private String coupon;
	private String size;
	
	public Zudio()
	{
	}
	
	
	public Zudio(String name, String id, String color, double price, String coupon, String size) {
		super();
		this.name = name;
		this.id = id;
		this.color = color;
		this.price = price;
		this.coupon = coupon;
		this.size = size;
	}


	public String getName(String id) {
		if (id == this.id) {
			return name;
			
		}
		else {
			return "Invalid id";
		}
	}
	
	public String getId(String name,String size) {
		if (name == this.name && size == this.size) {
			return id;
		}
		else {
			return "Invalid Data";
		}
	}
	
	public String getColor(String id) {
		if ( id==this.id) {
			return id;
		}
		else {
			return "Invalid id";
		}
	}
	
	
	public double getPrice(String id) {
		if (id==this.id) {
			return price;
		}
		else {
			System.out.println("Invalid Id");
			return 0;
		}
	}
	
	
	public String getSize(String id) {
		if (id == this.id) {
			return size;
		}
		else {
			return "Invalid Id";
		}
	}
	
	
	public void setCoupon(String coupon) {
		if (coupon == this.coupon) {
			System.out.println("Price Before : "+price);
			price = price - price/10;
			System.out.println("Price Now : "+price);
		}
		else {
			System.out.println("Invalid Coupon");
		}
	}
	
	
	
	

}
