package com.medinfi.employee;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.medinfi.employee.dao.EmployeeDao;
import com.medinfi.employee.model.Employee;


public class EmployeeTest 
{
	public static void main(String a[])
	{
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	context.scan("com.medinfi.*");
	context.refresh();
	
	
    EmployeeDao employeeDao=(EmployeeDao)context.getBean("employeeDAO");
	Employee employee=(Employee)context.getBean("employee");
	 
	
	}
	
}
