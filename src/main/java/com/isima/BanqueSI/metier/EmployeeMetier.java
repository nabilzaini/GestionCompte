package com.isima.BanqueSI.metier;

import java.util.List;

import com.isima.BanqueSI.Employee;

public interface EmployeeMetier {
	public void saveEmployee(Employee e);
	public List<Employee> listEmployee();
}
