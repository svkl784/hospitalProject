package org.example.model.dao;

import org.example.model.entity.Employee;

import java.util.List;

// CRUD - create, read, update, delete
public interface EmployeeDao {
    void delete(Employee employee);
    void createOrUpdate(Employee employee);
    Employee getEmployeeById(int id);
    List <Employee> getAll();
    Employee getEmployeeByFirstName();
    Employee getEmployeeBySecondName();
    Employee getEmployeeByFirstAndSecondName();
    Employee getEmployeeByIdAndFirstAndSecondName();
}
