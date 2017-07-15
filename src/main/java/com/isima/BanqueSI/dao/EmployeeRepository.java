package com.isima.BanqueSI.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.isima.BanqueSI.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
