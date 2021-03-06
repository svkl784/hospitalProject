package org.svirid.model.dao.impl;

import org.svirid.model.dao.UserDao;
import org.svirid.model.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void deleteUser(User user) {
    }

    @Override
    public void createOrUpdate(User user) {
    }

    @Override
    public List<User> getAllUser() {
        Session session = sessionFactory.getCurrentSession();
        List <User> allUsers = session.createQuery("from User", User.class)
                .getResultList();
        return allUsers;
    }
}
