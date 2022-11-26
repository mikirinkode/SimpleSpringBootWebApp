package com.mikirinkode.simplewebapp.service;

import com.mikirinkode.simplewebapp.model.Employee;

import java.util.List;

public interface EmployeeServices {
    List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}
