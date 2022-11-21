package com.example.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.DataObjects.Employee;
import com.example.practice.service.EmployeeService;

@RestController
@ComponentScan
public class EmployControllerRest {
	@Autowired
	public EmployeeService service;
	@RequestMapping("/employget")
	public List<Employee> getAllEmployee(){
		return service.getAllValues();
	}
	@RequestMapping(method=RequestMethod.POST,value="/employpost",consumes="application/json")
	public Employee addToDb(@RequestBody Employee employee) {
		service.addDataEmploy(employee);
		return employee;
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/employdelete/{empid}" )
	public void deleteFromDb(@PathVariable int empid) {
		service.deleteDataEmploy(empid);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/employupdate/{empid}")
	public void updateFromDb(@PathVariable int idval,@RequestBody Employee employee) {
		service.updateDataEmploy(idval,employee);
	}
}
