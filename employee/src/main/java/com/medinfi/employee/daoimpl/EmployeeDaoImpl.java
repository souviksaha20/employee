package com.medinfi.employee.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.medinfi.employee.dao.EmployeeDao;
import com.medinfi.employee.model.Employee;
import com.medinfi.employee.model.EmployeeEntity;




@Repository("employeeDAO")
public class EmployeeDaoImpl implements EmployeeDao
{
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	
	
	
	public EmployeeDaoImpl(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EmployeeEntity> findAll() {
		List<EmployeeEntity> list = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			list = session.createQuery("select e.id as id, "
					+ "e.name as name, "
					+ "Designation as Designation, "
					+ "number as number "
					+ "from Employee e")
					.setResultTransformer(Transformers.aliasToBean(EmployeeEntity.class)).list();
			transaction.commit();
		} catch (Exception e) {
			list = null;
			if(transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return list;
	}
	
	@Override
	public void create(Employee employee) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.saveOrUpdate(employee);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> findAllEmployee() {
		List<Employee> list = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			list = session.createCriteria(Employee.class)
					.list();
			transaction.commit();
		} catch (Exception e) {
			list = null;
			if(transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return list;
	}
	
	@Override
	public Employee find(int id) {
		Employee employee = null;
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			employee= (Employee) session.createQuery("from Employee "
						+ "where id = :id")
					.setInteger("id", id)
					.uniqueResult();
			transaction.commit();
		} catch (Exception e) {
			employee = null;
			if(transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
		return employee;
	}
	
	@Override
	public void delete(Employee employee) {
		Session session = null;
		Transaction transaction = null;
		try {
			session = sessionFactory.openSession();
			transaction = session.beginTransaction();
			session.delete(employee);
			transaction.commit();
		} catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
		} finally {
			session.close();
		}
	}
	
	

}
