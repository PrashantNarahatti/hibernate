package inheritance.task;

public class Account extends Person {

	public Account(String name, double balance) {
		super(name, balance);
		// TODO Auto-generated constructor stub
	}

	long accNo;
	double balance;

	public Account(String name, double balance, long accNo, double balance2) {
		super(name, balance);
		this.accNo = accNo;
		balance = balance2;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double depositAmount) {
		if (depositAmount > 0.0)
			balance = balance + depositAmount;
	}

	public void withdraw(double withdrawAmount) {
		{
			if (withdrawAmount > 0.0)
				balance = balance + withdrawAmount;
		}

	}

}
