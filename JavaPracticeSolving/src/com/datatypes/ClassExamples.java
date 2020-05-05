package com.datatypes;

public class ClassExamples {

		public static void main(String[] args)
		{
			Stud s1=new Stud();
			Stud s2=new Stud();
//			Initialization of class through reference variable
			s1.id=100;
			s1.name="Karshil";
			System.out.println("id:"+s1.id+"name:"+s1.name);
//			Initialization through method
			s2.data(1, "karshil");
			s1.data(2, "raj");
			s2.display();
			s1.display();
			s1.rollnumber=45;
			System.out.println(s1.rollnumber);
//			Initialization through constructor
			s1.data(101, "dnfjgh");
			s1.display();
			
			
		}
}
class Stud{
	
	int id;
	String name;
	int rollnumber;
	String fname;
	void data(int i,String n)
	{
		 rollnumber=i;
		 fname=n;
	}
	void display()
	{
		
		System.out.println(rollnumber+" "+fname);
	}
}
