package banco;

import java.util.Scanner;

import entities.account;

public class application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		account acc;
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char test = sc.next().charAt(0);
		if (test == 'y' || test == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			acc = new account(name,accNumber,initialDeposit);
		}
		else{
			acc = new account(name,accNumber);
		}
		System.out.println("");
		System.out.println("Account Data:");
		System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f", acc.getAccNumber(), acc.getName(), acc.getBalance());
		System.out.println("\n");
		System.out.print("Enter a deposit value: ");
		acc.deposit(sc.nextDouble());
		System.out.println("Update Account data: ");
		System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f", acc.getAccNumber(), acc.getName(), acc.getBalance());
		System.out.println("\n");
		System.out.print("Enter a withdraw value: ");
		acc.withdraw(sc.nextDouble());
		System.out.println("Update Account data: ");
		System.out.printf("Account: %d, Holder: %s, Balance: $ %.2f", acc.getAccNumber(), acc.getName(), acc.getBalance());
		
		sc.close();
	}

}
