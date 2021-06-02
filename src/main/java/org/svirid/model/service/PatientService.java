package org.svirid.model.service;

import org.svirid.model.entity.Patient;

import java.util.List;

public interface PatientService {
    public List<Patient> getAllPatient();
    public void createPatient(Patient patient);
}
