/**
 * 
 * 			Author : Karshil Sheth
 * 			Date : 1st May,2020
 * 
 * 
 * 
 * */

package com.threadpractice;

	class MultithreadingDemo extends Thread
	{ 
	    public void run() 
	    { 
	        try
	        { 
	            // Displaying the thread that is running 
	        	
	            System.out.println ("Thread 1 is " + 
	                  Thread.currentThread().getId() + 
	                  " is running"); 
	  
	        } 
	        catch (Exception e) 
	        { 
	            // Throwing an exception 
	            System.out.println ("Exception is caught"); 
	        } 
	    }
	    public void start1() 
	    { 
	        try
	        { 
	            // Displaying the thread that is running 
	            System.out.println ("Thread 2 is  " + 
	                  Thread.currentThread().getId() + 
	                  " is running"); 
	            Thread.sleep(5000);
	  
	        } 
	        catch (Exception e) 
	        { 
	            // Throwing an exception 
	            System.out.println ("Exception is caught"); 
	        } 
	    }
	}
	  
	// Main Class 
	public class ThreadPractice2
	{ 
	    public static void main(String[] args) 
	    { 
	        int n = 8; // Number of threads 
	        for (int i=0; i<8; i++) 
	        { 
	            MultithreadingDemo object = new MultithreadingDemo(); 
	            MultithreadingDemo object2 = new MultithreadingDemo(); 
	            
	            
	            object.start(); 
	            try {
	            	
	            	object.join();
	            	
	            }
	            catch(Exception e) {
	            	System.out.println("Exception Handle!!");
	            }
	            object2.start();
	       
	        } 
	    } 
	} 

