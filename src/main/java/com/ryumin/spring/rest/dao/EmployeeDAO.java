package com.ryumin.spring.rest.dao;

import com.ryumin.spring.rest.entity.Employee;

import java.util.List;


public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
