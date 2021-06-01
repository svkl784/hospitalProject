package org.example.model.dao;

import org.example.model.entity.Employee;
import org.example.model.entity.User;

import java.util.List;

public interface UserDao {
    void delete(User user);
    void createOrUpdate(User user);
    List<User> getAllUser();

}
