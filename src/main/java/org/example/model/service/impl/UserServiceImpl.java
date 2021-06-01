package org.example.model.service.impl;

import org.example.model.dao.UserDao;
import org.example.model.entity.User;
import org.example.model.service.UserService;
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
