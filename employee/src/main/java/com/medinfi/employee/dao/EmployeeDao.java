package com.medinfi.employee.dao;

import java.util.List;

import com.medinfi.employee.model.Employee;
import com.medinfi.employee.model.EmployeeEntity;



public interface EmployeeDao {
	public List<EmployeeEntity> findAll();
	
	public List<Employee> findAllEmployee();
	
	public Employee find(int id);
	
	public void create(Employee employee);
	
	public void delete(Employee employee);
	
	
}
