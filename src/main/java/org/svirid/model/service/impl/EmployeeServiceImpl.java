package org.svirid.model.service.impl;

import org.svirid.model.dao.EmployeeDao;
import org.svirid.model.entity.Employee;
import org.svirid.model.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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
