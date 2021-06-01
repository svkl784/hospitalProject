package org.example.model.service.impl;

import org.example.model.dao.EmployeeDao;
import org.example.model.entity.Employee;
import org.example.model.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    @Transactional
    public List<Employee> getAllEmployee() {
        return employeeDao.getAllEmployee();
    }
}
