package moneyatreATM;

public class Accounts {
	 String Name;
	 double balance;
	 int password;
	 String NationalID;
	 String Gender;
	
	public Accounts(String Name,int password, double balance,String NationalID) {
		this.Name=Name;
		this.balance=balance;
		this.password=password;
		this.NationalID=NationalID;
		
	}
	public double getBalance() {
		return  this.balance;
	}
	public String getName() {
		return this.Name;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}

	public void setGender(String Gender) {
		this.Gender=Gender;
	}

}
