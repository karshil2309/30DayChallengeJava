/**
 * 
 * 			Author			: 	Karshil	Sheth
 * 			Date			:	26th April,2020
 * 			Task			:   Programming with Array. some overloading and overriding concepts are also included. 
 * 			
 * 
 * 
 * 
 * */
package com.arrayjava;

import java.util.Scanner;

public class StudyArra{

	
	public static void main(String[] args)
	{
		
		int n=10;
		int[] student=new int[n];
//		DECLARING ARRAY
		int marks[]=new int[5];
		float roll[]= {1,20.99f,3,4};
		System.out.println(roll); //print memory location
		//continous store location
		System.out.println(roll[0]);
		
		for(int i=0;i<roll.length;i++)
		{
			System.out.println(roll[i]);
		}
		
		AveMarks avg=new AveMarks();
		avg.hashCode();
		System.out.println(avg.hashCode());
		avg.StudyArra();
		
		
		Base ds=new Derived();
		ds.method(10.43);
	
	}

}
 class AveMarks{
	 
	 
		 void StudyArra()
		 {
			 System.out.println("Please enter the number of studnets");
			 Scanner sc=new Scanner(System.in);
			int sizen=sc.nextInt();
			int sum=0;
			int mrks[]=new int[sizen];
			System.out.println("Please enter the number of marks of "+sizen+"student");
			for(int i=0;i<sizen;i++)
			{
			
				mrks[i]=sc.nextInt();
				System.out.println(mrks[i]);
				sum+=mrks[i];
			}
			System.out.println(sum);
			int avg=sum/sizen;
			System.out.println(avg);
			
		 }
	 
 }
	
 class Base  
 {  
     void method(int a)  
     {  
         System.out.println("Base class method called with integer a = "+a);  
     }  
        
     void method(double d)  
     {  
         System.out.println("Base class method called with double d ="+d);  
     }  
 }  
    
 class Derived extends Base  
 {  
     @Override  
     void method(double d)  
     {  
         System.out.println("Derived class method called with double d ="+d);  
     }  
 }  
    
 
