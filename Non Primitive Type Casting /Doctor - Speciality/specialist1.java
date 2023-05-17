
public class specialist1 {

	public static void main(String[] args) {

		specialist s1 = new  specialist("HDHHV12554", "GEN-FIRST AID", "ZACK", "CARDIOLOGIST", 2005);
		
		s1.displayDoctor();
		s1.displaySpecialist();
		
		doctor d1 = s1;
		
		// d1.displaySpecialist(); //cte
		
		d1.displayDoctor();

	}

}
