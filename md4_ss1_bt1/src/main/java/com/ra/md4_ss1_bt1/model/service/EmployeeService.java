package com.ra.md4_ss1_bt1.model.service;

import com.ra.md4_ss1_bt1.model.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee save(Employee employee);
    void delete(Employee employee);
    Employee findById(long id);
}