package relationship;

public class WhatsAppDriver {

	public static void main(String[] args) {
		WhatsApp w1 = new WhatsApp("v2.900.8", "8-3-2023", "Ankeet");
		
		w1.displayWhatsApp();
		
		w1.addStatus("GOOD MORNING", "GOOD NIGHT", "AT WORK", "BUSY", "URGENT CALLS ONLY");
		
		w1.s1.displayCalls();

	}

}
