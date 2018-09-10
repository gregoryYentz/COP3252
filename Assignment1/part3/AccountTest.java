//Gregory Yentz

import java.util.Scanner;

public class AccountTest{
	public static void main(String[] args){
		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);
		

		// display initial balance of each object
		displayAccount(account1);
		displayAccount(account2);
		System.out.print("\n");	

		// create a Scanner to obtain input from the command window
		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding to account1 balance%n%n",depositAmount);
		account1.deposit(depositAmount);

		// display balances
		displayAccount(account1);
		displayAccount(account2);
		System.out.print("\n");	

		System.out.print("Enter deposit amount for account2: "); // prompt
		depositAmount = input.nextDouble();
		System.out.printf("%nadding to account2 balance%n%n",depositAmount);
		account2.deposit(depositAmount);

		// display balances
		displayAccount(account1);
		displayAccount(account2);
		System.out.print("\n");	
	
	}

	public static void displayAccount(Account accountToDisplay){
		System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}
}
