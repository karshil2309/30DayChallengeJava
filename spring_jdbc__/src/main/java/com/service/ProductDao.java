package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.bean.ProductBean;

@Component("pdao")
public class ProductDao {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	


	public int saveProduct(ProductBean p)
	{
		String query = "insert into products values('"+p.getProductId()+"','"+p.getPrductName()+"','"+p.getProductPrice()+"')";
		
		return jdbcTemplate.update(query);
	}




	public void setJdbcTemplate(JdbcTemplate jdbcTemplate2) {
		// TODO Auto-generated method stub
		
	}
	
}
