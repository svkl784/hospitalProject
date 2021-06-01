package org.example.model.service;

import org.example.model.entity.Employee;
import org.example.model.entity.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


public interface UserService {
    public List<User> getAllUser();

}
