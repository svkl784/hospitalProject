package org.example.model.dao.impl;

import org.example.model.dao.EmployeeDao;
import org.example.model.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void delete(Employee employee) {

    }
    @Override
    public void createOrUpdate(Employee employee) {

    }

    @Override
    public Employee getEmployeeById(int id) {
        return null;
    }

    @Override
    public List<Employee> getAllEmployee() {
        Session session = sessionFactory.getCurrentSession();
        List <Employee> allEmployees = session.createQuery("from Employee", Employee.class)
                .getResultList();
        return allEmployees;
    }

    @Override
    public Employee getEmployeeByFirstName() {
        return null;
    }

    @Override
    public Employee getEmployeeBySecondName() {
        return null;
    }

    @Override
    public Employee getEmployeeByFirstAndSecondName() {
        return null;
    }

    @Override
    public Employee getEmployeeByIdAndFirstAndSecondName() {
        return null;
    }
}
