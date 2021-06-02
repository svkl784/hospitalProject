package org.example.model.dao.impl;

import org.example.model.dao.PatientDao;
import org.example.model.entity.Employee;
import org.example.model.entity.Patient;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PatientDaoImpl implements PatientDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void deletePatient(Patient patient) {

    }

    @Override
    public void createPatient(Patient patient) {
        Session session = sessionFactory.getCurrentSession();
        session.save(patient);
    }


    @Override
    public List<Patient> getAllPatient() {
        Session session = sessionFactory.getCurrentSession();
        List <Patient> allPatients = session.createQuery("from Patient ", Patient.class)
                .getResultList();
        return allPatients;
    }


}
