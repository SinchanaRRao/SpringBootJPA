package com.employee.employee;


import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	private final EmployeeService employeeService;
   
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    
	

	@PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("employees/{empdid}")
    public Optional<Employee> getEmployeeById(@PathVariable int empdid) {
        return employeeService.getEmployeeById(empdid);
    }

    @PutMapping("/employees/{empdid}")
    public Employee updateEmployee(@PathVariable int empdid, @RequestBody Employee employee) {
       // employee.setEmpdid(empdid);
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{empdid}")
    public void deleteEmployee(@PathVariable int empdid) {
        employeeService.deleteEmployee(empdid);
    }
}
    
    
    



