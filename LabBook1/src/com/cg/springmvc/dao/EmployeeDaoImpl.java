package com.cg.springmvc.dao;

import java.util.List;




import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springmvc.dto.Employee;

@Repository("emplyeedao")
public class EmployeeDaoImpl implements IEmployeeDao{
	
	@PersistenceContext
	EntityManager em;

	@Override
	public int addEmployeeData(Employee emp) {
		// TODO Auto-generated method stub
		em.persist(emp);
		em.flush();
		return emp.getEmpId();
	}

	@Override
	public List<Employee> showAllEmployee() {
		// TODO Auto-generated method stub
		Query queryone = em.createQuery("FROM Employee");
		List<Employee> myList = queryone.getResultList();
		
		return myList;
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("DELETE FROM Employee WHERE empId=:eid");
		query.setParameter("eid", empId);
		query.executeUpdate();
		
		
	}

	@Override
	public void updateEmployee(Employee emp) {
	
		em.merge(emp);
		em.flush();		
	
}

	@Override
	public Employee searchEmployee(int empId) {
		// TODO Auto-generated method stub
		Query querythree = em.createQuery("SELECT e FROM Employee e WHERE empId=:eid");
		querythree.setParameter("eid", empId);
		Employee e = (Employee) querythree.getSingleResult();
		return e;
	}

	@Override
	public void enrollEmployee(Employee emp) {
		// TODO Auto-generated method stub
		em.merge(emp);
		em.flush();	
	}

}
