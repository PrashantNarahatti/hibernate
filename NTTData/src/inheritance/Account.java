package inheritance;

public class Account extends Person {

	private long accNo;
	private double balance=500;
	private Person accHolder;

	public Account(String name, int age, long accNo, double balance, Person accHolder) {
		super(name, age);
		this.accNo = accNo;
		this.balance = balance;
		this.accHolder = accHolder;
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

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("amount deposited avaialable balance :" + this.balance);

	}

	public void withdrawal(double amount) {
		this.balance+=this.balance - amount;
		System.out.println("amount withdrawal avaialable balance :" + this.balance);
	}
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}

	

}
