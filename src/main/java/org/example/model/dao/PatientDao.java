package org.example.model.dao;

import org.example.model.entity.Employee;
import org.example.model.entity.Patient;

import java.util.List;

public interface PatientDao {
    void delete(Patient patient);

    void createOrUpdate(Patient patient);

    Patient getPatientById(int id);

    List<Patient> getAllPatient();

    Patient getPatientByFirstName();

    Patient getPatientBySecondName();

    Patient getPatientByFirstAndSecondName();

    Patient getPatientByIdAndFirstAndSecondName();
}
