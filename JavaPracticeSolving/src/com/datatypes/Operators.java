
package com.datatypes;

public class Operators {
	
	/** We can compile the java class without main method using static block.
	 * by writing Static {  code/...}  and it will compile but while running using java
	 *  Test it will give No such method found Error. so no point of using it
	 *  Supported till java 6 and java 7 onwards no such thing is there.
	 *  */
	/*
	 * there are total 8 types of operator in java which are as follows: 1) Unary
	 * Operator, 2) Arithmetic Operator, 3) Shift Operator, 4) Relational Operator,
	 * 5) Bitwise Operator, 6) Logical Operator, 7) Ternary Operator and 8)
	 * Assignment Operator.
	 */
	//static {
	//}
		public static void main(String args[])
		{
			
		int x=10,y=-23;
		boolean d=true;
		
//		Java unary operators
		System.out.println(x++);// 10
		System.out.println(++x);//12
		System.out.println(x--);//12
		System.out.println(--x);//10
		System.out.println(x++ + ++x);//22
		System.out.println(x-- - ++x);//0
		System.out.println(~x);//-13 because postive 12+1 with negative sign
		System.out.println(~y);//22 because negative -23+1=22
		System.out.println(!d);//false
		
		
//		---------------------
//		Arithemtic operators [remeber BODMASS Rule]
		int a=234,b=243;
		
		System.out.println(a+b);//15  
		System.out.println(a-b);//5  
		System.out.println(a*b);//50  
		System.out.println(a/b);//2  
		System.out.println(a%b);//0  
		//------------------------------
		// Assignment Operator
		a+=b;
		System.out.println(a);
		a-=b;
		System.out.println(a);
		

//		-------------------
//		left shift vs right shift operator
//		in right shift operator it will divide and then power so 10/2^2=2
//		in left shift operator it will multiply and then power so 10*2^2=40
		System.out.println(20>>2);
		System.out.println(20>>>2);
		System.out.println(-20>>2);
		System.out.println(-20>>>2);
		System.out.println(20<<2);
		System.out.println(-20<<2);
		System.out.println(20<<-2);

		
		
//		-------------
//		Logical And && Bitwise &
		/**
		 The logical && operator 
		 doesn't check second condition if first condition is false. 
		 It checks second condition only if first one is true.
		
		The bitwise & operator always checks both conditions whether
 		first condition is true or false.
		 * */
		
		int k=10;  
		int l=5;  
		int m=20;  
		System.out.println(k<l&&k<m);//false && true = false  
		System.out.println(k<l&k<m);//false & true = false  
		
//		The logical || operator doesn't check second condition if first condition is true. 
		//It checks second condition only if first one is false.

//		The bitwise | operator always checks both conditions whether first condition is true or false.
		
		// Logical || Bitwise |
		
		int a1=10;  
		int b1=5;  
		int c1=20;  
		System.out.println(a1>b1||a1<c1);//true || true = true  
		System.out.println(a1>b1|a1<c1);//true | true = true  
		//|| vs |  
		System.out.println(a1>b1||a1++<c1);//true || true = true  
		System.out.println(a1);//10 because second condition is not checked  
		System.out.println(a1>b1|a1++<c1);//true | true = true  
		System.out.println(a1);//11 because second condition is checked 
		
		//---------------------------------------------------
		// Ternary operator
		int min=(a<b)?a:b;  
		System.out.println(min);
		
		
		}

	
}
