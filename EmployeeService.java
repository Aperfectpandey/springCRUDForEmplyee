package com.example.practice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.DataObjects.Employee;
import com.example.practice.repository.EmployInterface;
@Service
public class EmployeeService {
	@Autowired
	public EmployInterface employinterfacerepo;
	
	public List<Employee> getAllValues(){
		List<Employee> emps=new ArrayList<>();
		employinterfacerepo.findAll().forEach(emps::add);
		return emps;
	}
	public Employee addDataEmploy(Employee employ) {
		employinterfacerepo.save(employ);
		return employ;
	}
	public void deleteDataEmploy(int empId) {
		employinterfacerepo.deleteById(empId);
	}
	public void updateDataEmploy(int id,Employee employee) {
		employinterfacerepo.save(employee);
	}
}
