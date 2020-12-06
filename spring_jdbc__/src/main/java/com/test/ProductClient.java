package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.bean.ProductBean;
import com.bean.ProductBeanConfig;
import com.service.ProductDao;

public class ProductClient {

	public static void main(String[] args) {

		//ApplicationContext ctz = new FileSystemXmlApplicationContext("src/main/java/com/cnfg/spring.xml");
		
		AnnotationConfigApplicationContext ctz = new AnnotationConfigApplicationContext(ProductBeanConfig.class);

		ProductDao pdao = ctz.getBean("pdao", ProductDao.class);
		ProductBean p = new ProductBean();
		p.setProductId(1);
		p.setPrductName("apple");
		int status  = pdao.saveProduct(p);
		System.out.println(status);
	}

}
