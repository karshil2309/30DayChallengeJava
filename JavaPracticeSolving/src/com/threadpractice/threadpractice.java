package com.threadpractice;

import java.util.Scanner;

//
//public class threadpractice extends Thread {
//	public void start()
//	{
//		int n=5;
//		for(int i=1;i<5;i++)
//		{
//			System.out.println("Hi thread"+Thread.currentThread().getId());
//			try{
//				Thread.sleep(500);
//			}
//			catch(InterruptedException e){
//				System.out.println(e);
//			}
//			System.out.println("\t"+i);
//		}
//	}
//	public void run() {
//		
//		System.out.println("Calling run method");
//	}
//	
//
//	public static void main(String args[]) {
//		threadpractice tp=new threadpractice();
//		thread2 thre2=new thread2();
//		tp.start();
////		try {
////			thre2.wait(500);
////		} catch (InterruptedException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		tp.run();
//		thre2.run();
//		
////		try {
////			tp2.join();
////		}
////		catch(InterruptedException e) {
////			System.out.println(e);
////		}
//
//		
//	}
//	
//}
//class thread2{
//	public void run()
//	{
//		for(int i=0;i<=8;i++) {
//			try {
//				Thread.sleep(1500);
//				System.out.println("Hii"+Thread.getAllStackTraces()+Thread.currentThread().getName().charAt(0));
//			}
//			catch(Exception e) {
//				System.out.println("Interrupted exception is Handled!!");
//			}
//			System.out.println(i);
//		}
//	}
//}
   
public class threadpractice implements Runnable{
	public static void main(String[] ar){
		threadpractice tcd1=new threadpractice();
		threadpractice tcd2=new threadpractice();
		Thread t1=new Thread(tcd1);
		Thread t2=new Thread(tcd2);
		t1.start();
		try {
			Thread.sleep(60000);
			t2.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	int balance=4000,amt;

	Scanner sc=new Scanner(System.in);
	public void run(){
		int totalbalance,deop;
		deop=sc.nextInt();
		totalbalance=amt+deop;
		System.out.println(totalbalance);
	
	}
	public void start(){
		
		System.out.println("Please enter the money to withdrawl:");
		amt=sc.nextInt();
		System.out.println(amt);

	}
}
