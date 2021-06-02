package org.example.model.dao;

import org.example.model.entity.Patient;
import org.example.model.entity.Therapy;

import java.util.List;

public interface TherapyDao {
    void delete(Therapy therapy);

    void createOrUpdate(Therapy therapy);

    List<Therapy> getAllTherapy();

}
