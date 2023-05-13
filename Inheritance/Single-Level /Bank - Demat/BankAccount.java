package singlelevel;

public class BankAccount {
	
	private String bank;
	private String name;
	private long phno;
	private String type;
	private long accno;
	private String ifsc;
	
	public BankAccount() {
		
	}

	public BankAccount(String bank, String name, long phno, String type, long accno, String ifsc) {
		super();
		this.bank = bank;
		this.name = name;
		this.phno = phno;
		this.type = type;
		this.accno = accno;
		this.ifsc = ifsc;
	}
	
	public void displayBankAccount()
	{
		System.out.println("Bank : "+bank);
		System.out.println("Name : "+name);
		System.out.println("Contact : "+phno);
		System.out.println("Account Type : "+type);
		System.out.println("Account No : "+accno);
		System.out.println("IFSC : "+ifsc);
		System.out.println("*************************");
	}
	
	
	

}
