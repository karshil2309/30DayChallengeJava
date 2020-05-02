package com.datatypes;

public class Variables {

	/**  3 local variable which are practicsed.
	 * */
	int data= 50; // instance variable
	static int da=9;
	static int m=5; // static variable
	public static void main(String args[])
	{
		System.out.println(da);
		int l=0;
		System.out.println(l);
		int n=90;// local variable
		 //m=n++;
		 m=10; 
		 System.out.println(m);
		 // Narrowing { Type casting from float to int}
		 float f=10.6f;
		 int m=(int)f;
		 System.out.println(m);
		 
		 // overflowing  
		 byte b=120;
		 byte c=(byte) (b*b);// byte has some range i.e -126 to 126 so it will change the value.
		 int d=(int)c;
		 c=10;
		 d=10;
		 byte finali =(byte)(c+d);//Adding lower type.
		 //System.out.println(b*b);
		 //System.out.println(c);
		 System.out.println(finali);
		 float stu=2;
		 float roo=4;
		 long studnroo=(long) (stu>roo?stu:roo);
		 System.out.println(studnroo);
	}
	void method()
	{
		float f=10.6f;
		int m=(int)f;
		System.out.println(m);
	}
}
