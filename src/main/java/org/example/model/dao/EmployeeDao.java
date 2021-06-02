package org.example.model.dao;

import org.example.model.entity.Employee;

import java.util.List;

// CRUD - create, read, update, delete
public interface EmployeeDao {
    public void deleteEmployee(Employee employee);

    public void createOrUpdate(Employee employee);

    public List <Employee> getAllEmployee();

}
