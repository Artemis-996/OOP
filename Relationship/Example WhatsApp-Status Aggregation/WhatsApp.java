package relationship;

public class WhatsApp {
	
	String update;
	String releasedate;
	String username;
	status s1;
	

	public WhatsApp() {
	}


	public WhatsApp(String update, String releasedate, String username) {
		this.update = update;
		this.releasedate = releasedate;
		this.username = username;
	}
	
	public void addStatus(String morning, String night, String working, String busy, String calls)
	{
		s1 = new status(morning,night,working,busy,calls);
	}
	
	public void displayWhatsApp()
	{
		System.out.println("Version : "+update);
		System.out.println("Release Date :"+releasedate);
		System.out.println("UserName : "+username);
	}
	

}
