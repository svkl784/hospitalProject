package org.example.model.service.impl;

import org.example.model.dao.TherapyDao;
import org.example.model.entity.Therapy;
import org.example.model.service.TherapyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class TherapyServiceImpl implements TherapyService {
    @Autowired
    private TherapyDao therapyDao;

    @Override
    @Transactional
    public List<Therapy> getAllTherapy() {
        return therapyDao.getAllTherapy();
    }
}
