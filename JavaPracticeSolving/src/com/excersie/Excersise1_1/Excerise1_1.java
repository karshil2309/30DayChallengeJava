/**
 * 
 * 			Author			: 	Karshil	Sheth
 * 			Date			:	27th April,2020
 * 			Task			: Excersie 1_1 OCA/OCJP SE 7
 * 			
 * 
 * 			PS: Avoid spelling mistakes pls !!:); 
 * 
 * */
package com.excersie.Excersise1_1;
import com.excersie.Excersise1_1.food.Fruit;

public class Excerise1_1 {

	public static void main(String args[]) {
		System.out.println("This program is to explain the access specifer in java");
		System.out.println("Now if we create a food directory outside this package "
				+ "then inorder to use Apple class we need to place Fruit.class there"
				+ "so thats how it works. Without that you will get compilation error.");
	}
	
}



 class Apple extends Fruit{
//	we can get methods of super class Fruits 
}