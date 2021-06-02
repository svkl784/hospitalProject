package org.svirid.model.dao;

import org.svirid.model.entity.Therapy;

import java.util.List;

public interface TherapyDao {
    void delete(Therapy therapy);

    void createOrUpdate(Therapy therapy);

    List<Therapy> getAllTherapy();

}
