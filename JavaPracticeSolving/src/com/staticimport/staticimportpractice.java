/**
 * 
 * 			Author			: 	Karshil	Sheth
 * 			Date			:	27th April,2020
 * 			Task			: Writing import static program and why is it used.
 * 			
 * 
 * 
 * 
 * */
package com.staticimport;

import static java.lang.System.out;
import static java.lang.Integer.*;
//import static java.lang.Long.*;
public class staticimportpractice {

	public static void main(String args[])
	{
		out.println(MAX_VALUE);
		out.println(toHexString(42));
		//static import and static blocks/statements are different.
		//		must write import static & not vice versa
		// using long and integer will create compiler error
	}
	
}
