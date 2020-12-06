package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bean.Employee;
import com.bean.SpringbeanConfiguration;
import com.service.EmployeeDao;

public class Clientapp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringbeanConfiguration.class);
		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		Employee e = new Employee();
		e.setId(102);
		int status = dao.saveEmployee(e);
	   // dao.list();	
	    List<Employee> list  = dao.list();
	    for(Employee e1:list)
	    {
	    	System.out.println(e1.getId());
	    }
	    
		System.out.println(status);
	}
	
	

}
