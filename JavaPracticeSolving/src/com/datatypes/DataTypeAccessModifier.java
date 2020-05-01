/**
 * 
 * 
 * 
 * 
 * 
 * 				1) Final Methods Cannot be overriden
 * 				2) 
 * */


package com.datatypes;

public class DataTypeAccessModifier extends Subclass {

	
	public static void main(String args[]) {
	
		SuperClass sc=new Subclass();
		sc.showSample();
	
	
		Subclass fv=new Subclass();
		fv.finalClass();
		fv.showSample();
	}
}


 class SuperClass{
	private int a=5;
	final long b=567l;
	protected final void showSample() {

		System.out.println("Super Class with Protected method+"+" "+a+" "+b);
	}
}
 
 class Subclass extends SuperClass{
	
	  void finalClass() {
		   int a=45;
		 System.out.println( "SubClass default Method"+a);
	 }
 }