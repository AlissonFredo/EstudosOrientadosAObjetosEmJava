package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1023, "Maria", 1000.0, 0.01));
		list.add(new BusinessAccount(1003, "Bob", 1000.0, 500.0));
		list.add(new SavingsAccount(1004, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1005, "Pedro", 500.0, 500.0));
		
		double sun = 0.0;
		for(Account acc: list) {
			sun += acc.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n", sun);
		
		for(Account acc: list) {
			acc.deposit(10.0);
		}
		
		for(Account acc: list) {
			System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}
		
	}

}
