package inheritance;

public class AccountTest {

	public static void main(String[] args) {
		Account account1=new Account("Smitha",24,123456l,2000,new Person("Smitha",24));
		Account account2=new Account("Kathya",24,123456l,3000,new Person("Kathya",24));
		
		System.out.println(account1);
		System.out.println(account2);
		
		account1.deposit(2000);
		account2.deposit(2000);
		System.out.println(account1);
		System.out.println(account2);
		
		SavingAccount sv1=new SavingAccount("Smitha",24,123456l,2000,new Person("Smitha",24));
		sv1.withdrawal(100);
		System.out.println("savingAccount balance :"+sv1);
		
		SavingAccount sv2=new SavingAccount("Kathya",24,123456l,3000,new Person("Kathya",24));
		sv2.withdrawal(100);
		System.out.println("savingAccount balance :"+sv2);
		
		CurrentAccount ca1=new CurrentAccount("Smitha",24,123456l,2000,new Person("Smitha",24));
		ca1.withdrawal(100);
		System.out.println("CurrentAccount balance :"+ca1);
		
		CurrentAccount ca2=new CurrentAccount("Kathya",24,123456l,3000,new Person("Kathya",24));
		ca2.withdrawal(100);
		System.out.println("CurrentAccount balance :"+ca2);
	}

}
