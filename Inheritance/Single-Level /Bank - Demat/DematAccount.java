package singlelevel;

public class DematAccount extends BankAccount {
	
	private String dematNo;
	private String depository;
	private String segment;
	
	public DematAccount() {
		// TODO Auto-generated constructor stub
	}

	public void displayDematAccount() {
		displayBankAccount();
		
		System.out.println("Demat Number : "+dematNo);
		System.out.println("Depository : "+depository);
		System.out.println("Segments : "+segment);
	}
	
	public DematAccount(String bank, String name, long phno, String type, long accno, String ifsc,String dematNo, String depository, String segment) {
		super(bank,name,phno,type, accno,ifsc);
		this.dematNo = dematNo;
		this.depository = depository;
		this.segment = segment;
	}

	public String getSegment() {
		return segment;
	}

	public void setSegment(String segment) {
		this.segment = segment;
	}

	public String getDematNo() {
		return dematNo;
	}

	public String getDepository() {
		return depository;
	}
	
	
	

}
