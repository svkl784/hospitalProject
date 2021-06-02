package org.svirid.model.dao.impl;

import org.svirid.model.dao.EmployeeDao;
import org.svirid.model.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void deleteEmployee(Employee employee) {

    }
    @Override
    public void createOrUpdate(Employee employee) {

    }

    @Override
    public List<Employee> getAllEmployee() {
        Session session = sessionFactory.getCurrentSession();
        List <Employee> allEmployees = session.createQuery("from Employee", Employee.class)
                .getResultList();
        return allEmployees;
    }

}
