package com.springboot.springbootcrud.dao;

import com.springboot.springbootcrud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Primary
public class EmployeeDAOJpaImp implements EmployeeDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Employee> findAll() {
		return entityManager.createQuery("from Employee", Employee.class).getResultList();
	}
	
	@Override
	public Employee findById(int id) {
		return entityManager.find(Employee.class, id);
	}
	
	@Override
	public void save(Employee employee) {
		entityManager.merge(employee);
	}
	
	@Override
	public void deleteById(int id) {
		entityManager.createQuery("delete from Employee where id = :id").setParameter("id", id).executeUpdate();
	}
}
