package org.svirid.model.dao;

import org.svirid.model.entity.Patient;

import java.util.List;

public interface PatientDao {
    public void deletePatient(Patient patient);

    public void createPatient(Patient patient);

    public List<Patient> getAllPatient();
}


