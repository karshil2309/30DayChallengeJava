package com.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import com.bean.Employee;

@Component("edao")
public class EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e) {
		String query = "insert into employee values( '" + e.getId() + "','" + e.getName() + "','" + e.getSalary()
				+ "')";

		return jdbcTemplate.update(query);
	}

	public List<Employee> list() {

		return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<Employee>>() {
			
			
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {

				List<Employee> list = new ArrayList<Employee>();
				while (rs.next()) {
					Employee e = new Employee();
					e.setId(rs.getInt(1));
					e.setName(rs.getString(2));
					e.setSalary(rs.getInt(3));
					list.add(e);
				}
				return list;
			}
		});
	}

}
