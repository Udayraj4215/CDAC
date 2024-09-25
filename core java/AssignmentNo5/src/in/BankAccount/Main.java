package in.BankAccount;

import java.util.Scanner;

class accountinfo {
	private String name;
	protected int accountbalance;
	
	accountinfo(){
		this.name="";
		this.accountbalance=0;
	}
	
	accountinfo(String name, int accountbalance){
		this.name=name;
		this.accountbalance=accountbalance;
	}
	
	public void setnme(String name) {
		this.name=name;
	}
	
	public void setaccountbalance(int accountbalance) {
		this.accountbalance=accountbalance;
	}
	
	Scanner sc = new Scanner(System.in);
	public void deposit() {
		int amount = sc.nextInt();
		this.accountbalance = this.accountbalance+amount;
	}
	
	public void getData() {
		System.out.println("Enter your name:");
		this.name = sc.nextLine();
		System.out.println("Enter account balance");
		this.accountbalance=sc.nextInt();
	}
	
	public void withdraw() {
		int amount = sc.nextInt();
		this.accountbalance = accountbalance - amount;
		System.out.println("remaining balance is "+accountbalance);
	}
	
	public void showRecord() {
		System.out.println("Youe account name is"+this.name);
		System.out.println("Remaining balance"+this.accountbalance);
	}
}

class SavingAccount extends accountinfo{
	private static final float  MAX_AMOUNT = 10000.0f;
	
	public void withdraw() {
		int amount = sc.nextInt();
		if(MAX_AMOUNT < amount) {
			System.out.println("cannot withdraw more than 10000");
		} else {
			this.accountbalance = accountbalance - amount;
			System.out.println("remaining balance is "+accountbalance);
		}
	}
}

public class Main{
	public static void main(String[] args) {
		SavingAccount acc = new SavingAccount();
		System.out.println("Enter your data");
		acc.getData();
		System.out.println("you enter your data is");
		acc.showRecord();
		System.out.println("how much amount want to withdraw");
		acc.withdraw();
	}
}


