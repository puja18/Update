package com.cg.springmvc.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvc.dao.IEmployeeDao;
import com.cg.springmvc.dto.Employee;

@Service("employeeservice")
@Transactional
public class EmployeeServiceImpl implements IEmployeeService {
	
	@Autowired
	private IEmployeeDao employeeDao;

	@Override
	public int addEmployeeData(Employee emp) {
		// TODO Auto-generated method stub
		return employeeDao.addEmployeeData(emp);
	}

	@Override
	public List<Employee> showAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.showAllEmployee();
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		employeeDao.deleteEmployee(empId);
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	     employeeDao.updateEmployee(emp);
	}

	@Override
	public Employee searchEmployee(int empId) {
		// TODO Auto-generated method stub
		return employeeDao.searchEmployee(empId);
	}

	@Override
	public void enrollEmployee(Employee emp) {
		// TODO Auto-generated method stub
		employeeDao.enrollEmployee(emp);
	}

	
}
