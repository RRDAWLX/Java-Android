package Algrithm;

public class BankApp {
	public static void main(String[] args){
		BankAccount ba1 = new BankAccount(100.23);
		BankAccount ba2 = new BankAccount(13.25);
		
		ba1.deposite(30.45);
		
		ba1.withdraw(23.84);
		
		System.out.println(ba1.toString());
	}
}
