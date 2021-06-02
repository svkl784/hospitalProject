package org.svirid.model.service.impl;

import org.svirid.model.dao.UserDao;
import org.svirid.model.entity.User;
import org.svirid.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    @Transactional
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
}
