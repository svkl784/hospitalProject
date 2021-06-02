package org.svirid.model.dao;

import org.svirid.model.entity.User;

import java.util.List;

public interface UserDao {
    void deleteUser(User user);
    void createOrUpdate(User user);
    List<User> getAllUser();

}
