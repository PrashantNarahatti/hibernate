package inheritance.task;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account("Smith", 2000);
		Account account2 = new Account("Kathy", 3000);
		
		Person ps1=new Person("Smith",2000);
		Person ps2=new Person("Kathy",3000);


		// display initial balance of each object
		System.out.printf("%s balance: %.2f%n", ps1.getName(), ps1.getBalance());
		System.out.printf("%s balance: %.2f%n%n", ps2.getName(), ps2.getBalance());

		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

		// display balances
		System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %.2f%n%n", account2.getName(), account2.getBalance());

		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);

		// display balances
		System.out.printf("%s balance: %.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s balance: %.2f%n%n", account2.getName(), account2.getBalance());
	}

}
