package com.medinfi.employeefrontend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.medinfi.employee.dao.EmployeeDao;
import com.medinfi.employee.model.Employee;
import com.medinfi.employee.model.EmployeeEntity;



@Service
@Transactional(readOnly = true)
@Repository("employeeService")
public class EmployeeserviceDoaImpl implements EmployeeService
{
	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public List<EmployeeEntity> findAll() {
		return employeeDao.findAll();
	}

	@Override
	public void create(Employee event) {
		System.out.println(1);
		employeeDao.create(event);
	}

	@Override
	public List<Employee> findAllEmployee() {
		System.out.println(1);
		return employeeDao.findAllEmployee();
	}

	@Override
	public Employee find(int id) {
		return employeeDao.find(id);
	}

	@Override
	public void delete(Employee event) {
		employeeDao.delete(event);
	}

	
}
