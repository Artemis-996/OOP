package relationship;

public class status {
	
	String morning;
	String night;
	String working;
	String busy;
	String calls;
	
	public status() {
		
	}


	public status(String morning, String night, String working, String busy, String calls) {
		
		this.morning = morning;
		this.night = night;
		this.working = working;
		this.busy = busy;
		this.calls = calls;
	}
	
	
	public void displayMorning()
	{
		System.out.println("Current Status :"+morning);
	}
	
	public void displayNight()
	{
		System.out.println("Current Status :"+night);
	}
	
	public void displayWorking()
	{
		System.out.println("Current Status :"+working);
	}
	
	public void displayBusy()
	{
		System.out.println("Current Status :"+busy);
	}
	
	public void displayCalls()
	{
		System.out.println("Current Status :"+calls);
	}


	
	

}
