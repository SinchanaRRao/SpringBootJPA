
package com.employee.employee;


import java.util.Map;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class EmployeeService {
	
	
	private final EmployeeRepository employeeRepository;

	
	@Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
	
	
	
	public Employee addEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	
	public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }



	public Optional<Employee> getEmployeeById(int empdid) {
		return employeeRepository.findById(empdid);
	}

	
	public Employee updateEmployee( Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public void deleteEmployee(int empdid) {
		employeeRepository.deleteById(empdid);
	}

}
