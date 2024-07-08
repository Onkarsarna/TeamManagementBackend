package com.management.emp_mangement.repository;

import com.management.emp_mangement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee getByName (String name);

    Employee findByName(String name);

    Employee findByid (Integer id);
}
