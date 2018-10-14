package com.medinfi.employeefrontend.service;

import java.util.List;

import com.medinfi.employee.model.Employee;
import com.medinfi.employee.model.EmployeeEntity;



public interface EmployeeService {

	public List<EmployeeEntity> findAll();
	
	public List<Employee> findAllEmployee();
	
	public void create(Employee employee);
	
	public Employee find(int id);
	
	public void delete(Employee employee);
	
	
	
}
