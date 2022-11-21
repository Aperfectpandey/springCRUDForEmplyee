package com.example.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.DataObjects.Employee;

public interface EmployInterface extends JpaRepository<Employee,Integer>{

}
