package com.isima.BanqueSI.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.isima.BanqueSI.Employee;
import com.isima.BanqueSI.metier.EmployeeMetier;

@RestController
public class EmployeeRestService {
	
	@Autowired
	private EmployeeMetier employeMetier;
	@RequestMapping(value="/employes", method=RequestMethod.POST)
	public void saveEmployee(@RequestBody Employee e) {
		employeMetier.saveEmployee(e);
	}
	@RequestMapping(value="/employes", method=RequestMethod.GET)
	public List<Employee> listEmployee() {
		return employeMetier.listEmployee();
	}
}
