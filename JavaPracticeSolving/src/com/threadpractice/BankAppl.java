package com.threadpractice;

//(1) Write a Java program to create implement banking transactions 
//of depositing

//and withdrawing amount. If insufficient funds are available, deny withdrawal operation.
//Withdrawal operation should be allowed if deposit is done and the funds are enough.                                                                                                                                                                                                                                                                     Note :                                                                                                                                                   * Create separate threads to support Withdraw and Deposit transactions. And execute thread invoking Withdraw operation first, 
//then execute thread invoking Deposit operation.



import java.util.Scanner;
public class BankAppl {

	static float totalBankBalance=10000;
	static BankAppl bank = new BankAppl();

	public synchronized void withDrw(float withdrw) {
	
		if(totalBankBalance>=withdrw) {
			System.out.println("Thread is : " + Thread.currentThread().getName() + "True Part");
			totalBankBalance-=withdrw;
			System.out.println("Total amount after withdrawl is"+totalBankBalance);
		}
		
			
		
		else {
			System.out.println("Total amount is " + totalBankBalance + "from which enter withdrawl amount cannot be withdraw " );
			System.out.println("Thread is : " + Thread.currentThread().getName() + " False Part ");
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("Exception handled!");
			}
//			System.out.println("Please deposit some amount");
//			if(totalBankBalance <=withdrw)
//			{
//				System.out.println("Please enter the deposit amount again");
//				totalBankBalance+=withdrw;
//				System.out.println("balance before withdrawl"+totalBankBalance);
//				float amt=totalBankBalance-withdrw;
//				System.out.println("The new Balance is "+amt);
//			}
//			else {
			totalBankBalance -= withdrw;
			System.out.println("Total Amount after withdrw is : " +" "+ totalBankBalance);
			
		}
	}
	public synchronized void depBank(float depositAmt) {
		System.out.println("Thread is : " + Thread.currentThread().getName());
		totalBankBalance+= depositAmt;
		System.out.println("Total Amount after deposit is : " + totalBankBalance);
		notify();
	}

	
	
	public static void main(String args[]) {
		
		System.out.println("\t\t\tWelcome To Karshil Sheth Bank!!!\n");
//		System.out.println("Please enter the Amount to be withdrawl");
		Scanner scanobj=new Scanner(System.in);
//		System.out.println("Please enter the money to withdraw!!");
		float withdrw=20000;
		
		Withdrw wdUser=new Withdrw(bank, withdrw);
		Thread t1=new Thread(wdUser);
		t1.setName("Withdrawl thread has been called");
		float depositAmt=10000;
		Depos dpUser=new Depos(bank,depositAmt);
		Thread t2=new Thread(dpUser);
		t2.setName("Deposit Thread has been called");
		
		t1.start();
//		try {
//			if(totalBankBalance<=withdrw) {
//				Thread.sleep(500);
//				t2.start();
//			}
//		}
//		catch(Exception e) {
//			System.out.println("Some Exception has been handled. Please try executing it again!!");
//		}
		t2.start();
	}	
}

class Depos implements Runnable {

	private BankAppl account;
	
	private float depositAmt;

	 Depos(BankAppl account, float depositAmt) {
		this.depositAmt = depositAmt;
		this.account = account;
	}

	@Override
	public void run() {

		try {
			System.out.println("Thread running for deposit is "+" "+Thread.currentThread().getId());
			this.account.depBank(this.depositAmt);

		} catch (Exception ex) {
		
			System.out.println("Exception Handled at DepositeRunnable ! ");
		}

	}
}
class Withdrw implements Runnable {

	private BankAppl account;
	
	private float withdraw;

	 Withdrw(BankAppl account, float withdrw) {
		this.withdraw = withdrw;
		this.account = account;
	}

	@Override
	public void run() {

		try {
			System.out.println("Thread running for withdrawl is "+" "+Thread.currentThread().getId());
			this.account.withDrw(this.withdraw);

		} catch (Exception ex) {
		
			System.out.println("Exception Handled at DepositeRunnable ! ");
		}

	}
}


















































/**
 * //class withdraw extends deposit implements Runnable{
//	static int balance=1000;
////	withdraw(){
//	public void run(){
//			Scanner sc=new Scanner(System.in);
//			System.out.println("Please enter the Ruppes to Withdrawl :");
//			float withdBal=sc.nextFloat();
//			
//			if(withdBal>balance){
//				System.out.println("Insufficient Balance to Withdrawl!! Happy Day..");
//			}
//		else {
//			
//		 System.out.println("Please enter money to withdraw!!");
//		 float totlBal=balance-withdBal;
//		 System.out.println("Thread  :"+ " "+Thread.currentThread().getName());
//		 System.out.println("The Balance is :"+totlBal);
//			}
//	
//	}
//	}
//
//class deposit extends Thread{
//	
//	static int initialBalance =5000;
//	deposit(){
//		Scanner objdepo=new Scanner(System.in);
//		int myDeposit=objdepo.nextInt();
//		System.out.println("The total balance is Rs: "+ " "+initialBalance+myDeposit);
//		
//	}
//	public void run() {
//		
//		
//		
//	}
//}
//class Account1 {
//    int balance= 1000;
//
//    public int getBal(){
//        return balance;
//    }
//
//    public void withdraw(int bal){
//        balance= balance-bal;
//    }
//
//    public void deposit(int bal){
//        balance= balance+bal;
//    }
//}*/

