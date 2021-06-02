package org.svirid.model.dao.impl;

import org.svirid.model.dao.TherapyDao;
import org.svirid.model.entity.Therapy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class TherapyDaoImpl  implements TherapyDao {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void delete(Therapy therapy) {
    }

    @Override
    public void createOrUpdate(Therapy therapy) {
    }

    @Override
    public List<Therapy> getAllTherapy() {
        Session session=sessionFactory.getCurrentSession();
        List <Therapy> allTherapy = session.createQuery("from Therapy", Therapy.class)
                .getResultList();
        return allTherapy;
    }
}
