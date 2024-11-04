package com.ra.md4_ss1_bt1.model.repository;

import com.ra.md4_ss1_bt1.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
