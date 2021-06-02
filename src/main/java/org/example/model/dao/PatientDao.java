package org.example.model.dao;

import org.example.model.entity.Employee;
import org.example.model.entity.Patient;

import java.util.List;

public interface PatientDao {
    public void deletePatient(Patient patient);

    public void createPatient(Patient patient);

    public List<Patient> getAllPatient();
}


