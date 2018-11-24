package com.cg.springmvc.service;

import java.util.List;

import com.cg.springmvc.dto.Employee;

public interface IEmployeeService {
	
	public int addEmployeeData(Employee emp);
	public List<Employee> showAllEmployee();
	public void deleteEmployee(int empId);
	public void updateEmployee(Employee emp);
	public Employee searchEmployee(int empId);
	public void enrollEmployee(Employee emp);
	

}
