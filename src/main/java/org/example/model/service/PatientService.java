package org.example.model.service;

import org.example.model.entity.Patient;

import java.util.List;

public interface PatientService {
    public List<Patient> getAllPatient();
    public void createPatient(Patient patient);
}
