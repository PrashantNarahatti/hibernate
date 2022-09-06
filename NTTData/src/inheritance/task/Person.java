package inheritance.task;

public class Person {
	String name;
	double balance;

	public Person(String name, double balance) {
		super();
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	void SavingAccount(double minBalanace) {
		System.out.println("min balance");
	}

	void CurrentAccount(double overdraft) {
		System.out.println("overdraft limit");
	}
}
