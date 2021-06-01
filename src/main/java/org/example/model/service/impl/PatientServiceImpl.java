package org.example.model.service.impl;

import org.example.model.dao.PatientDao;
import org.example.model.entity.Patient;
import org.example.model.service.PatientService;
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
}
