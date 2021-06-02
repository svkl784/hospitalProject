package org.svirid.model.service.impl;

import org.svirid.model.dao.PatientDao;
import org.svirid.model.entity.Patient;
import org.svirid.model.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {
    @Autowired
    private PatientDao patientDao;

    @Override
    @Transactional
    public List<Patient> getAllPatient() {
        return patientDao.getAllPatient();
    }

    @Override
    @Transactional
    public void createPatient(Patient patient) {
        patientDao.createPatient(patient);

    }
}
