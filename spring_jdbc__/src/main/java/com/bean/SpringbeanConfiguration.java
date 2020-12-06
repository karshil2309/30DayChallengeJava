package com.bean;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.service.EmployeeDao;

@Configuration
@ComponentScan(basePackages = "com.service")

public class SpringbeanConfiguration {

	@Bean
	public DataSource dataSourse()
	{
	DriverManagerDataSource  ds = new DriverManagerDataSource();
	ds.setPassword("root");
	ds.setUrl("jdbc:mysql://localhost:3306/test");
	ds.setUsername("root");
	ds.setDriverClassName("com.mysql.jdbc.Driver");
	
	return ds;
	
	}
	
	@Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSourse());
        return jdbcTemplate;
    }
 
    @Bean
    public EmployeeDao employeeDAO(){
    	EmployeeDao empDao = new EmployeeDao();
        empDao.setJdbcTemplate(jdbcTemplate());
        return empDao;
    }
}
