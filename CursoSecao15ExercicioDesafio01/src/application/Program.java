package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		int number = keyboard.nextInt();
		System.out.print("Holder: ");
		keyboard.nextLine();
		String holder = keyboard.nextLine();
		System.out.print("Initial balance: ");
		double balance = keyboard.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = keyboard.nextDouble();
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter ammount for withdraw: ");
		double amount = keyboard.nextDouble();
			
		try {
			account.withdraw(amount);
			System.out.println("New balance: " + account.getBalance());
		}catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		keyboard.close();
	}

}
