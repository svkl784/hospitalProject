package org.example.model.service;

import org.example.model.dao.TherapyDao;
import org.example.model.entity.Therapy;

import java.util.List;

public interface TherapyService {
    public List <Therapy> getAllTherapy();
}
