class BagDriver 
{
	public static void main(String[] args) 
	{
		System.out.println("********* American Tourister ***********");

		Bag b1 = new Bag();
		System.out.println(b1.type);
		System.out.println(b1.brand);
		System.out.println(b1.litcapacity);
		System.out.println(b1.price);
		System.out.println(b1.modelnumber);
		System.out.println(b1.waterproof);
		

		b1.type = "Trekking Bag";
		b1.brand = "American Tourister";
		b1.litcapacity = 60.0;
		b1.price = 2500;
		b1.modelnumber = "XA1MB001";
		b1.waterproof = true;
	
		System.out.println("********************");

		System.out.println("Type : "+b1.type);
		System.out.println("Brand : "+b1.brand);
		System.out.println("Liter Capacity : "+b1.litcapacity);
		System.out.println("Price : "+b1.price);
		System.out.println("Model Number : "+b1.modelnumber);
		System.out.println("Water Proof :"+ b1.waterproof);

		System.out.println("********** Sky Bags **********");


		Bag b2 = new Bag();
		System.out.println(b2.type);
		System.out.println(b2.brand);
		System.out.println(b2.litcapacity);
		System.out.println(b2.price);
		System.out.println(b2.modelnumber);
		System.out.println(b2.waterproof);

		b2.type = "School Bag";
		b2.brand = "Sky Bag";
		b2.litcapacity = 20.0;
		b2.price = 800;
		b2.modelnumber = "SKY9508TS";
		b2.waterproof = false;

		System.out.println("********************");

		System.out.println("Type :"+b2.type);
		System.out.println("Brand : "+b2.brand);
		System.out.println("Liter Capacity : "+b2.litcapacity);
		System.out.println("Price : "+b2.price);
		System.out.println("Model Number : "+b2.modelnumber);
		System.out.println("Water Proof :"+b2.waterproof);

		


	}
}
