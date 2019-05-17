package com.springboot.springbootcrud.dao;

import com.springboot.springbootcrud.entity.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOHibernateImp implements EmployeeDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> findAll() {
		return getSession().createQuery("from Employee", Employee.class).getResultList();
	}
	
	@Override
	public Employee findById(int id) {
		return getSession().get(Employee.class, id);
	}
	
	@Override
	public void save(Employee employee) {
		getSession().saveOrUpdate(employee);
	}
	
	@Override
	public void deleteById(int id) {
		getSession().createQuery("delete from Employee where id = :id").setParameter("id", id).executeUpdate();
	}
	
	private Session getSession() {
		return entityManager.unwrap(Session.class);
	}
}
