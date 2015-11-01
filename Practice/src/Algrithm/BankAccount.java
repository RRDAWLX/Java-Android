package Algrithm;
public class BankAccount {
	private double balance;
	
	public BankAccount(double openAccount){
		balance = openAccount;
		System.out.println("Initial balance: " + balance);
	}
	
	public void deposite(double amount){
		balance += amount;
		display();
	}
	
	public void withdraw(double amount){
		balance -= amount;
		display();
	}
	
	public void display(){
		System.out.println("Balance: " + balance);
	}
}
