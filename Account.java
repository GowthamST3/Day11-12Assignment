package com.BridgeLabz_Day11assignment;

import java.util.Scanner;

public class Account{
	Scanner scanner = new Scanner(System.in);

	public  void debit(int accBalance){
		System.out.println("Account Balance is.. : " + accBalance);
		System.out.println("Enter amount to debit : ");
		int debitamount = scanner.nextInt();
		int balanceamount = accBalance - debitamount;

		if( debitamount <= accBalance) {
			System.out.println("Money " + debitamount + " is Debited from Account ");
			System.out.println("Your BALANCE is "+balanceamount);
		}else{
			System.out.println("You tried to Debit amount " + debitamount + " it is exceeded the account balance " + accBalance);
		}
		System.out.println("Thanks for your transaction");
	}

	public  void credit(int accBalance){
		System.out.println("Account Balance is.. : " + accBalance);
		System.out.println("Enter amount to credit : ");
		int creditamount = scanner.nextInt();
		int balanceamount = accBalance + creditamount;
			System.out.println("Amount "+ creditamount + " is credited and Account balance is " + balanceamount);
			System.out.println("Thanks for your transaction");
		}
	
	public  void accbalance(int accBalance){
		System.out.println("Total Balance amount is.. : " + accBalance);
		System.out.println("Thanks for your transaction");
	}
	public static void main(String[] args) {
		Account account = new Account();
		System.out.println("Enter the amount");
		Scanner scanner = new Scanner(System.in);
		int accBalance = scanner.nextInt();
		System.out.println("Choose your option :\n Account balance -A \n Credit - C \n debit - D"); 
		String ch = scanner.next();
		switch(ch){
		case "A":
			account.accbalance(accBalance);
			break;
		case "C":
			account.credit(accBalance);
			break;
		case "D":
			account.debit(accBalance);
			break;
		default:
			System.out.println("You are not performed any Transaction");
			break;

		}
		System.out.println("Transaction Completed"); 
	}
}




