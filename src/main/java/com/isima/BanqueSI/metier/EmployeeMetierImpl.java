package com.isima.BanqueSI.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.isima.BanqueSI.Employee;
import com.isima.BanqueSI.dao.EmployeeRepository;
@Service
public class EmployeeMetierImpl implements EmployeeMetier{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public void saveEmployee(Employee e) {

		employeeRepository.save(e);
		
	}

	@Override
	public List<Employee> listEmployee() {
		
		return employeeRepository.findAll();
	}

}
